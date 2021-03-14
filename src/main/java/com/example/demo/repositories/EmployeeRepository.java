package com.example.demo.repositories;

import com.example.demo.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    boolean findByFirstNameAndLastName(String firstName, String lastName);

    Employee findEmployeeByFirstNameAndLastName(String firstName, String lastName);


     Employee findByLastName(String lastName);

}
