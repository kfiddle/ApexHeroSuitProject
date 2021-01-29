package com.example.demo.controllers;


import com.example.demo.models.Employee;
import com.example.demo.repositories.CompanyRepository;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class EmployeeController {

    @Resource
    EmployeeRepository employeeRepo;

    @Resource
    CompanyRepository companyRepo;


    @PostMapping("/add-employees")
    public String addNewEmployees(@RequestBody Employee...employees) {
        for (Employee employee : employees) {
            employeeRepo.save(employee);
        }
        return "redirect:/submittedPage";
    }


}
