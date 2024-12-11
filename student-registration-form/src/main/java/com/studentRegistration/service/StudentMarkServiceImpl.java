package com.studentRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentRegistration.entity.StudentMark;
import com.studentRegistration.repository.StudentMarkRepository;

@Service
public class StudentMarkServiceImpl implements StudentMarkService {

    @Autowired
    private StudentMarkRepository studentMarkRepository;

    @Override
    public StudentMark addStudentMark(StudentMark studentMark) {
        // Business logic to calculate the total mark
        int totalMark = studentMark.getTermOralMark() + studentMark.getTermWrittenMark();
        studentMark.setTotalMark(totalMark);  // Set the calculated total mark

        return studentMarkRepository.save(studentMark);
    }

    @Override
    public List<StudentMark> getAllStudentMarks() {
        return studentMarkRepository.findAll();
    }
}
