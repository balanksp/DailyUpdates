package com.project.SpringBootCurd.service;

import com.project.SpringBootCurd.bean.Subject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.SpringBootCurd.repository.SubjectRepository;

@Service
public class SubjectService {

public  SubjectRepository subjectrepo;

    public List<Subject> getAllSubjects()
    {
           List <Subject> subjects = new ArrayList<>();
        subjectrepo.findAll().forEach(subject -> subjects.add(subject));
       return subjects;
    }

    // add all subjects in DB
    public void addSubject(Subject subject) {
      subjectrepo.save(subject);

    }

    // update the subject in the DB
    public void updateSubject(String string, Subject subject) {
        subjectrepo.save(subject);
    }

    // delete the id from the DB
    public void deleteSubject(String id) {
        subjectrepo.deleteById(id);
    }



}
