

package com.example.tarea_clase4_20224926.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "jobs")
public class Jobs {

    @Id
    @Column(name = "job_id", length = 10, nullable = false)
    private String id;

    @Column(name = "job_title", length = 35, nullable = false)
    private String jobTitle;

    @Column(name = "min_salary")
    private Integer minSalary;

    @Column(name = "max_salary")
    private Integer maxSalary;

    // Relación inversa: Un Job puede estar asignado a muchos Employees
    @OneToMany(mappedBy = "job")
    private List<Employees> employees;
}
