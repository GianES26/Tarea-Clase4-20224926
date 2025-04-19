package com.example.tarea_clase4_20224926.repository;

import com.example.tarea_clase4_20224926.entity.JobHistory;
import com.example.tarea_clase4_20224926.entity.JobHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryId> {

    List<JobHistory> findByEmployeeFirstNameContainingOrEmployeeLastNameContainingOrJobJobTitleContainingOrDepartmentDepartmentNameContaining(
            String firstName, String lastName, String jobTitle, String departmentName);
}
