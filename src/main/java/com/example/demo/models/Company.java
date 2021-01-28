package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "company")
    private Collection <Employee> employees;

    @OneToMany(mappedBy = "company")
    private Collection<JobSite> jobSites;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public Collection<JobSite> getJobSites() {
        return jobSites;
    }


    public Company(){
    }

    public Company(String name){
        this.name = name;
    }

    public void addEmployees(Employee...newEmployeesToAdd){
        employees.addAll(Arrays.asList(newEmployeesToAdd));
    }



}
