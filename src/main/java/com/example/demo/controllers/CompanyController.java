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
        Company companyToAdd = new Company(company.getName());
        companyRepo.save(companyToAdd);
    }

    @RequestMapping("/companies/{companyInBrowser}")
    public String displayACompanyName(Model model, @PathVariable String companyInBrowser) {
        Collection<Employee> employeesOfOneCompany = companyRepo.findByBrowserName(companyInBrowser).getEmployees();
        model.addAttribute("employeesOfSingleCompany", employeesOfOneCompany);
        Company companyToDisplay = companyRepo.findByBrowserName(companyInBrowser);
        model.addAttribute("companyName", companyToDisplay.getName());
        return "companyPage";
    }


    @RequestMapping("/{companyNameInBrowser}/employee-entry-form")
    public String displayFormPageForAddingEmployees(Model model, @PathVariable String companyNameInBrowser) {
        model.addAttribute("company", companyRepo.findByBrowserName(companyNameInBrowser));
        return "companyEmployeeEntryForm";
    }

}


