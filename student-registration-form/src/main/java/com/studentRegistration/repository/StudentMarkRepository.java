package com.studentRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentRegistration.entity.StudentMark;

@Repository
public interface StudentMarkRepository extends JpaRepository<StudentMark, Long> {
}
