package com.example.demo.service;

import java.util.List;

/*
 * This interface defines the contract for the service layer methods 
 * related to student operations.
 */

import com.example.demo.dto.StudentDto;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);

    StudentDto getStudentById(int id);

    List<StudentDto> getAllStudents();

    StudentDto  updateStudent(int id, StudentDto updatedStudent);

    void deleteStudent(int  id);
}
