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
    private String browserName;

    @OneToMany
    private Collection <Employee> employees;

    @OneToMany(mappedBy = "company")
    private Collection<JobSite> jobSites;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrowserName() {
        return browserName;
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
        this.browserName = toBrowser(name);
    }

    public static String toBrowser(String nameToDisplay) {
        String tempName = nameToDisplay.toLowerCase();
        char[] nameToCharArray = tempName.toCharArray();
        String displayedName = "";
        for (int i = 0; i < nameToCharArray.length; i++) {
            if (nameToCharArray[i] == ' '){
                nameToCharArray[i] = '-';
            }
            displayedName += nameToCharArray[i];
        }
         return displayedName;
    }


    public void addEmployees(Employee...newEmployeesToAdd) {
        employees.addAll(Arrays.asList(newEmployeesToAdd));
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

}
