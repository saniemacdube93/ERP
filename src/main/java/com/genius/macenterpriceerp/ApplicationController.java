package com.genius.macenterpriceerp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {


    @GetMapping("/index")
    public String home(){
        return "index";
    }


    @GetMapping("/hr")
    public String hr(){
        return "/hr/index";
    }



    @GetMapping("/fleet")
    public String fleet(){
        return "/fleet/index";
    }


    @GetMapping("/payroll")
    public String payroll(){
        return "/payroll/index";
    }


    @GetMapping("/accounts")
    public String accounts(){
        return "/acounts/index";
    }


    @GetMapping("/parameters")
    public String parameters(){
        return "/parameters/index";
    }



}
