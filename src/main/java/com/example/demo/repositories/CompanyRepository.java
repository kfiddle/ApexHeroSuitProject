package com.example.demo.repositories;

import com.example.demo.models.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
    Company findByName(String companyName);

    Company findByBrowserName(String companyNameInBrowser);

}
