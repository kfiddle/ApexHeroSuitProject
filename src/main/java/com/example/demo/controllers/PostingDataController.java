package com.example.demo.controllers;


import com.example.demo.models.Company;
import com.example.demo.repositories.CompanyRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class PostingDataController {

    @Resource
    CompanyRepository companyRepo;


}
