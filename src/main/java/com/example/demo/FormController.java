package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/testing-form")
    public String aPageForFormTesting() {
        return "testingForm";
    }

    @GetMapping("/user-form")
    public String userRepeatEntryForm() {
        return "userInputRepeatForm";
    }

    @GetMapping("/user-form-basic")
    public String basicUserEntryForm() {
        return "userBasicForm";
    }



}



