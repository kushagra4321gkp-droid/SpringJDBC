package com.Kushagra.SpringJDBC.service;

import com.Kushagra.SpringJDBC.StudentRepo;
import com.Kushagra.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent() {
//        System.out.println("Student added using Service");
        repo.save();
    }

    public List<Student> getStudent() {
        return repo.findAll();
    }
}
