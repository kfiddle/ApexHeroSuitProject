package com.example.demo.repositories;

import com.example.demo.models.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    Company findByBrowserName(String companyInBrowser);
}
