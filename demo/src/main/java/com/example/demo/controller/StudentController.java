/*
 * This class is a REST controller responsible for handling HTTP requests 
 * related to students.
 */

package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /*
     * Endpoint for adding a new student.
     * @param studentDto The DTO representing the student to be created.
     * @return ResponseEntity containing the DTO representing the created student.
     */
    
    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody  StudentDto studentDto){
        StudentDto savedStudent = studentService.createStudent(studentDto);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    /*
     * Endpoint for retrieving a student by ID.
     * @param id The ID of the student to retrieve.
     * @return ResponseEntity containing the DTO representing the retrieved student.
     */
    
    @GetMapping("{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable int id){
        StudentDto studentDto = studentService.getStudentById(id);
        return ResponseEntity.ok(studentDto);
    }

    /*
     * Endpoint for retrieving all students.
     * @return ResponseEntity containing a list of DTOs representing all students.
     */
    
    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents(){
        List<StudentDto> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    /*
     * Endpoint for updating student details.
     * @param id The ID of the student to update.
     * @param updatedStudent The DTO representing the updated student information.
     * @return ResponseEntity containing the DTO representing the updated student.
     */
    
    @PutMapping("{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable("id") int id, @RequestBody StudentDto updatedStudent){
        StudentDto studentDto = studentService.updateStudent(id, updatedStudent);
        return ResponseEntity.ok(studentDto);
    }

    /*
     * Endpoint for deleting a student.
     * @param id The ID of the student to delete.
     * @return ResponseEntity indicating successful deletion.
     */
    
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student deleted  successfully");
    }
}
