package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {


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


}



