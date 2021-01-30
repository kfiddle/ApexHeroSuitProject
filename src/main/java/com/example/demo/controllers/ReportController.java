package com.example.demo.controllers;


import com.example.demo.models.Employee;
import com.example.demo.models.Report;
import com.example.demo.repositories.CompanyRepository;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.ReportRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

@Controller
public class ReportController {

    @Resource
    ReportRepository reportRepo;

    @Resource
    EmployeeRepository employeeRepo;

    @Resource
    CompanyRepository companyRepo;

    @GetMapping("/user-form")
    public String userRepeatEntryForm() {
        return "userInputRepeatForm";
    }

    @GetMapping("/user-form-basic")
    public String basicUserEntryForm() {
        return "userBasicForm";
    }

    @GetMapping("/submission-successful")
    public String displayThankYouPage() {
        return "submittedPage";
    }

    @PostMapping("/{companyName}/{id}/submit-questionnaire")
    public void addReportToRepoAndEmployee(@RequestBody Report incomingReport, @PathVariable Long id) {
        String fName = incomingReport.getFirstName();
        String lName = incomingReport.getLastName();

        if (employeeRepo.findByFirstNameAndLastName(fName, lName) && companyRepo.existsById(id)) {
            Employee employeeToAddReport = employeeRepo.findEmployeeByFirstNameAndLastName(fName, lName);
            Report reportToAdd = new Report(employeeToAddReport,
                    incomingReport.getRightShoulderDiscomfort(),
                    incomingReport.getLeftShoulderDiscomfort(),
                    incomingReport.getUpperBackDiscomfort(),
                    incomingReport.getLowerBackDiscomfort(),
                    incomingReport.getRightHipDiscomfort(),
                    incomingReport.getLeftHipDiscomfort(),
                    incomingReport.getRightThighDiscomfort(),
                    incomingReport.getLeftThighDiscomfort(),
                    incomingReport.getRightKneeDiscomfort(),
                    incomingReport.getLeftKneeDiscomfort());
            reportRepo.save(reportToAdd);
        }

    }


}
