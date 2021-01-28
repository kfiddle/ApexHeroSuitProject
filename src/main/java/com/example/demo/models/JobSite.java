package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class JobSite {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "jobSite")
    private Collection<Employee> employees;

    @ManyToOne
    private Company company;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Employee> getEmployee() {
        return employees;
    }

    public Company getCompany() {
        return company;
    }


    public JobSite() {
    }

    public JobSite(String name) {
        this.name = name;
    }




}
