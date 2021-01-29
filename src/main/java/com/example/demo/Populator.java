package com.example.demo;

import com.example.demo.models.Company;
import com.example.demo.repositories.CompanyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    CompanyRepository companyRepo;


    @Override
    public void run(String... args) throws Exception {
        Company company007 = new Company("coolpeeps");
        Company mi6 = new Company("mi6");
        companyRepo.save(company007);
        companyRepo.save(mi6);


    }
}
