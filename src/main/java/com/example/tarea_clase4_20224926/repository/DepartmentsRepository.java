package com.example.tarea_clase4_20224926.repository;

import com.example.tarea_clase4_20224926.entity.Departments;
import com.example.tarea_clase4_20224926.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, Integer> {

    // Método para obtener los managers distintos (empleados que son managers en algún departamento)
    @Query("SELECT DISTINCT d.manager FROM Departments d WHERE d.manager IS NOT NULL")
    List<Employees> findDistinctManagers();
}
