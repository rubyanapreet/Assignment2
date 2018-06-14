package com.ruby.assignment2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Malik
 */
@RestController
@RequestMapping(value = "/rest/school")
class SchoolService {

    @RequestMapping(value = "/students/{id}")
    public Student getStudent(@PathVariable String id) {
        String URL = "http://localhost:8091/rest/student/" + id;
        RestTemplate template = new RestTemplate();
        Student student = template.getForObject(URL, Student.class);
        return student;
    }
}
