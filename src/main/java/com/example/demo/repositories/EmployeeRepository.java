package com.example.demo.repositories;

import com.example.demo.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {


    Employee findByLastName(String lastName);

    boolean findByFirstNameAndLastName(String fName, String lName);

    Employee findEmployeeByFirstNameAndLastName(String fName, String lName);
}
