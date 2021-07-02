package com.gatewayserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackAPIS {

    @GetMapping("/employeeServiceFallback")
    public String employeeServiceFallback(){
        return "Employee Services is too longer than expected"
                +"Try Again Later!";
    }



    @GetMapping("/projectServiceFallback")
    public String projectServiceFallback(){
        return "Project Services is too longer than expected"
                +"Try Again Later!";
    }

    @GetMapping("/allocationServiceFallback")
    public String allocationServiceFallback(){
        return "Allocation Services is too longer than expected"
                +"Try Again Later!";
    }

    @GetMapping("/timesheetServiceFallback")
    public String timesheetServiceFallback(){
        return "Timesheet Services is too longer than expected"
                +"Try Again Later!";
    }

    @GetMapping("/reportingServiceFallback")
    public String reportingServiceFallback(){
        return "Reporting Services is too longer than expected"
                +"Try Again Later!";
    }
}
