package com.sugarhikaru.job_hunt_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "companies")
public class Company {

    @Id // PK
    private Long companyId;

    private Long userId;

    private String companyName;

    private String industry;

    private String status;

    private LocalDate esDeadline;

    private LocalDate interviewDate;

    private String priority;

    private String note;

}