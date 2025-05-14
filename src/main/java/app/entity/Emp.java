package app.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Setter
public class Emp {
	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empno;
	
	@Column(name = "emp_name")
	private String ename;
	
	@Column(name = "emp_position")
	private String job;
	
//	@Column(name = "mgr")
//	private Integer mgr;
	
	@Column(name = "hire_date")
	private LocalDate hiredate;
	
	@Column(name = "emp_salary")
	private Double sal;

	@Column(name = "emp_department")
	private String dept;

	@Column(name = "emp_email")
	private String email;
	
//	@Column(name = "comm")
//	private Double comm;
	
//	@ManyToOne
//	@JoinColumn(name = "dept_id")
//	private Dept dept;

	@Builder
	public Emp(String ename, String job, LocalDate hiredate, Double sal, String dept, String email) {
//		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
		this.dept = dept;
		this.email = email;
	}
}