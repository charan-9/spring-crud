package com.spring_crud_app.spring_crud.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1")
public class CrudController {
    @GetMapping("")
    public String getMethodName() {
        return "Coming from docker, built using jenkins";
    }

}
