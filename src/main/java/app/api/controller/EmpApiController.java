package app.api.controller;


import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
