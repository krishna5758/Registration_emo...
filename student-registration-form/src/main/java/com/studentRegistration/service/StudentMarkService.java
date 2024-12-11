package com.studentRegistration.service;

import java.util.List;

import com.studentRegistration.entity.StudentMark;

public interface StudentMarkService {
    StudentMark addStudentMark(StudentMark studentMark);
    List<StudentMark> getAllStudentMarks();
}
