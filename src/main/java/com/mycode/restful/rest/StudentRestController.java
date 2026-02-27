package com.mycode.restful.rest;

import com.mycode.restful.pojo.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentRestController {

    private List<Student> list=new ArrayList<>();

    @PostConstruct
    public void loadData(){

        this.list.add(new Student("suganthy","sathiya"));
        this.list.add(new Student("Lekha","sathiya"));
        this.list.add(new Student("Sri","Rakshan"));
        this.list.add(new Student("Mamathy","sathiya"));
    }

    @GetMapping("/getStudent")
    public List<Student> getStudents(){

        return this.list;
    }

    @GetMapping("/student/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        return this.list.get(studentId);
    }
}
