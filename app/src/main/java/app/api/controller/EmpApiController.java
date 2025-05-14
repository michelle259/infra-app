package app.api.controller;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Emp;
import app.repository.EmpRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmpApiController {
    private final EmpRepository empRepository;  
   
    
    @PostMapping("/api/emp")
	public Emp registerEmp(@RequestBody Emp emp) {
		
		return empRepository.save(emp);	
	}
    
}
	
