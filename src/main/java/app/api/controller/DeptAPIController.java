package app.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Dept;
import app.service.DeptService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class DeptAPIController {
	
	private final DeptService deptService;
	
	
<<<<<<< HEAD
=======
	@GetMapping("/git")
	public String gitApi() {
		return "git controller";
	}
	
	
>>>>>>> 1509c0f74fd83c0798d8a4282b44e499bd00f59d
	@GetMapping("/test")
	public String deptApi() {
		return "dept api controller";
	}
	
	@GetMapping("/depts")
	public List<Dept> getDepts() {
		List<Dept> depts = deptService.getDepts();
		return depts;
	}
	
	@GetMapping("/depts/{deptno}")
	public Dept getDeptByDeptno(@PathVariable Integer deptno) {
		Dept dept = deptService.getDeptByDeptno(deptno);
		return dept;
	}
	
	@PostMapping("/depts")
	public Dept registerDept(@RequestBody Dept newDept) {
		Dept dept = deptService.registerDept(newDept);
		return dept;
	}
	
	@PutMapping("/depts/{deptno}")
	public Dept updateDept(@RequestBody Dept updateDept, @PathVariable Integer deptno) {
		Dept dept = deptService.updateDept(updateDept, deptno);
		return dept;
	}
	
	@DeleteMapping("/depts/{deptno}")
	public Dept deleteDeptByDeptno(@PathVariable Integer deptno) {
		Dept dept = deptService.deleteDeptByDeptno(deptno);
		return dept;
	}
}
