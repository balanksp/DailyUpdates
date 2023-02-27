package com.project.SpringBootCurd.controller;

import com.project.SpringBootCurd.bean.Subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.SpringBootCurd.service.SubjectService;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectservice;

    @RequestMapping("/subjects")

    public List<Subject> getAllSubjects() {
        return subjectservice.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/subjects")
    public void addSubject(@RequestBody Subject subject) {
        subjectservice.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/subjects/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Subject subject) {
        subjectservice.updateSubject("id", subject);
    }

    public void DeleteSubject(@PathVariable String id) {
        subjectservice.deleteSubject(id);
    }

}
