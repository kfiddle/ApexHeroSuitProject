package com.example.demo.controllers;


import com.example.demo.models.Employee;
import com.example.demo.repositories.CompanyRepository;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class EmployeeController {

    @Resource
    EmployeeRepository employeeRepo;

    @Resource
    CompanyRepository companyRepo;

    @RequestMapping("/all-employees")
    public String displayAllEmployeesInSystem(Model model) {
        model.addAttribute("allEmployees", employeeRepo.findAll());
        return "allEmployees";
    }

    @PostMapping("/add-employees")
    public void addNewEmployees(@RequestBody Employee employee) {
        employeeRepo.save(employee);
    }


}
