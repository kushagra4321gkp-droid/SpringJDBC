package com.Kushagra.SpringJDBC.repo;

import com.Kushagra.SpringJDBC.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public void save(){
        System.out.println("Added");
    }

    public List<Student> findAll(){

        List<Student> student = new ArrayList<>();
        return student;
    }


}
