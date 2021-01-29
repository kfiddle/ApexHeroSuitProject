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
        Company company007 = new Company("Cool Peeps");
        Company mi6 = new Company("Muffin Tops");
        Company new1 = new Company("Cool Kids Don't Cry");
        companyRepo.save(company007);
        companyRepo.save(mi6);
        companyRepo.save(new1);


    }
}
