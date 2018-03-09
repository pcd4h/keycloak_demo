package com.example.productapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.Arrays;

/**
 * Created by dirk on 2018/03/08.
 **/
@Controller
public class CallerController {

    @GetMapping(path = "/caller")
    public String getProducts(Model model){

        model.addAttribute("callerdetails", Arrays.asList("First Name: Joe", "Last Name: Bloggs", "Account No: 432434314"));
        return "callerdetails";
    }

}
