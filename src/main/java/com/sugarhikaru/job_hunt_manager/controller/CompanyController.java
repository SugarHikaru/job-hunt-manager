package com.sugarhikaru.job_hunt_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {
  
  @GetMapping("/companies")
  public String showCompanyList() {
    return "company-list";
  }

  @GetMapping("/companies/new")
  public String showCompanyForm() {
    return "company-form";
  }
}
