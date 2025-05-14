package app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Dept {
	@Id
	@Column(name = "dept_id")
	private Integer deptno;
	
	@Column(name="dept_name")
	private String dname;
	
	@Column(name = "dept_location")
	private String loc;
	
}
