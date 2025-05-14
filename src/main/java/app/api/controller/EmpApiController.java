package app.api.controller;


import java.util.List;
import java.util.Map;

import app.entity.EmpRequestDto;
import org.springframework.web.bind.annotation.*;

import app.entity.Emp;
import app.repository.EmpRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmpApiController {
    private final EmpRepository empRepository;

    @GetMapping("/api/emps")
    public Object getAllEmployees() {
        List<Emp> employees = empRepository.findAll();
        if (employees.isEmpty()) {
            return Map.of("msg", "사원정보가 존재하지 않습니다");
        }
        return employees;
    }

    @PutMapping("/api/emp/{empno}")
    public Object editEmp(@PathVariable Integer empno, @RequestBody EmpRequestDto newempdto) {
        Emp emp = empRepository.findById(empno).orElse(null);

        if (emp != null) {
            emp.setEname(newempdto.getEname());
            emp.setJob(newempdto.getJob());
//            emp.setMgr(newempdto.getMgr());
            emp.setHiredate(newempdto.getHiredate());
            emp.setSal(newempdto.getSal());
//            emp.setComm(newempdto.getComm());

//            Dept dept = deptRepository.findById(newempdto.getDeptno()).orElse(null);
            emp.setDept(newempdto.getDept());
            emp.setEmail(newempdto.getEmail());

            empRepository.save(emp);

            return Map.of("msg", "OK");

        } else {
            return Map.of("msg", "사원정보가 존재하지 않습니다");
        }
    }
}
