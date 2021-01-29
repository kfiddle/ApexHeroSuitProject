package com.example.demo.controllers;

import com.example.demo.models.Company;
import com.example.demo.models.Employee;
import com.example.demo.repositories.CompanyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

@CrossOrigin

@Controller
public class CompanyController {

    @Resource
    CompanyRepository companyRepo;

    @RequestMapping("/company-entry-form")
    public String displayFormToAddCompanies() {
        return "companyEntryForm";
    }

    @RequestMapping("/companies")
    public String displayAllCompaniesInRepository(Model model) {
        model.addAttribute("allCompanies", companyRepo.findAll());
        return "allCompanies";
    }

    @PostMapping("/add-companies")
    public void addCompaniesToRepository(@RequestBody Company company) {
        companyRepo.save(company);
    }

    @RequestMapping("/companies/{companyName}")
    public String displayACompanyName(Model model, @PathVariable String companyName) {
        Collection<Employee> employeesOfOneCompany = companyRepo.findByName(companyName).getEmployees();
        model.addAttribute("employeesOfSingleCompany", employeesOfOneCompany);
        Company companyToDisplay = companyRepo.findByName(companyName);
        model.addAttribute("companyName", companyToDisplay.getName());
        return "companyPage";
    }


    @RequestMapping("/{companyName}/employee-entry-form")
    public String displayFormPageForAddingEmployees(Model model, @PathVariable String companyName) {
        model.addAttribute("company", companyRepo.findByName(companyName));
        return "companyEmployeeEntryForm";
    }

}

