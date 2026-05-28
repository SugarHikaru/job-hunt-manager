package com.sugarhikaru.job_hunt_manager.repository;

import com.sugarhikaru.job_hunt_manager.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}