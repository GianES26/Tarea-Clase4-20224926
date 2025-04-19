package com.example.tarea_clase4_20224926.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class JobHistoryId implements Serializable {

    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;
}
