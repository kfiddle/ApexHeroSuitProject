package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;
    private String companyName;

    @ManyToOne
    private Company company;

    @ManyToOne
    private JobSite jobSite;

    private String email;
    private int heightInInches;
    private int weight;
    private int waist;
    private int age;
    private int gender;

    private int yearsAtCurrentJob;
    private int overallWorkEffort;
    private int typicalLiftEffort;
    private int heaviestLiftEffort;

    @OneToMany(mappedBy = "employee")
    private Collection<Report> reports;


    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public Company getCompany() {
        return company;
    }

    public String companyForDisplay() {
        return company.getName();
    }

    public JobSite getJobSite() {
        return jobSite;
    }

    public String getEmail() {
        return email;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public int getWeight() {
        return weight;
    }

    public int getWaist() {
        return waist;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public int getYearsAtCurrentJob() {
        return yearsAtCurrentJob;
    }

    public int getOverallWorkEffort() {
        return overallWorkEffort;
    }

    public int getTypicalLiftEffort() {
        return typicalLiftEffort;
    }

    public int getHeaviestLiftEffort() {
        return heaviestLiftEffort;
    }

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, String companyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
    }

    public Employee(String firstName, String lastName, Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.companyName = company.getName();
    }

    public Employee(String firstName, String lastName, Company company, JobSite jobSite) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobSite = jobSite;
    }

    public Employee(String firstName, String lastName, Company company, String email,
                    int height, int age, int years, int owe, int tle, int hle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.email = email;
        heightInInches = height;
        this.age = age;
        yearsAtCurrentJob = years;
        overallWorkEffort = owe;
        typicalLiftEffort = tle;
        heaviestLiftEffort = hle;

    }

    public void addReport(Report incomingReport) {
        reports.add(incomingReport);
    }
}
