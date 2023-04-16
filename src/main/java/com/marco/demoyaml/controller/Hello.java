package com.marco.demoyaml.controller;

import com.marco.demoyaml.bean.PersonDev;
import com.marco.demoyaml.bean.PersonZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private PersonZ personZ;

    @Autowired
    private PersonDev persondev;

    @GetMapping("/")
    public String hello() {
        System.out.println(personZ);
        System.out.println(persondev);
        return "Hello World...";
    }
}
