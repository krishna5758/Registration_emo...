package com.studentRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentRegistration.entity.StudentMark;
import com.studentRegistration.service.StudentMarkService;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:9422")
public class StudentMarkController {
    
    @Autowired
    private StudentMarkService studentMarkService;

    @PostMapping
    public StudentMark addStudentMark(@RequestBody StudentMark studentMark) {
        return studentMarkService.addStudentMark(studentMark);
    }

    @GetMapping
    public List<StudentMark> getAllStudentMarks() {
        return studentMarkService.getAllStudentMarks();
    }
}
