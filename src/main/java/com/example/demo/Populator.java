package com.example.demo;

import com.example.demo.models.Company;
import com.example.demo.repositories.CompanyRepository;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    CompanyRepository companyRepo;

    @Resource
    EmployeeRepository employeeRepo;


    @Override
    public void run(String... args) throws Exception {
        Company company007 = new Company("Spectre");
        Company mi6 = new Company("MI6");
        Company new1 = new Company("The Syndicate");
        Company smersh = new Company("Smersh");
        companyRepo.save(company007);
        companyRepo.save(mi6);
        companyRepo.save(new1);
        companyRepo.save(smersh);

    }
}
