package app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
@Entity
@Table(name = "emp")
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer id;

    @Column(name = "emp_name", nullable = false)
    private String name;

    @Column(name = "emp_position")
    private String position;

    @Column(name = "emp_salary", precision = 10, scale = 2)
    private BigDecimal salary;

    @Column(name = "emp_department")
    private String department;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Column(name = "emp_email", unique = true)
    private String email;
}
