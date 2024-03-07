/*
 * Implementation of the StudentService interface.
 * Provides methods for CRUD operations on student entities.
 */

package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /*
     * Creates a new student.
     * @param studentDto The DTO representing the student to be created.
     * @return The DTO representing the created student.
     */

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(savedStudent);
    }

    /*
     * Retrieves a student by ID.
     * @param id The ID of the student to retrieve.
     * @return The DTO representing the retrieved student.
     * @throws ResourceNotFoundException if the student with the given ID does not exist.
     */

    @Override
    public StudentDto getStudentById(int id) {
        Student student = studentRepository.findById(id).orElseThrow(() ->
                        new ResourceNotFoundException("Student is not exists with the given id : " + id));
        return StudentMapper.mapToStudentDto(student);
    }

    /*
     * Retrieves all students.
     * @return A list of DTOs representing all students.
     */

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map((student) -> StudentMapper.mapToStudentDto(student))
            .collect(Collectors.toList());
    }

    /*
     * Updates an existing student.
     * @param id The ID of the student to update.
     * @param updatedStudent The DTO representing the updated student information.
     * @return The DTO representing the updated student.
     * @throws ResourceNotFoundException if the student with the given ID does not exist.
     */

    @Override
    public StudentDto updateStudent(int id, StudentDto updatedStudent) {
        Student student = studentRepository.findById(id).orElseThrow(() ->
                        new ResourceNotFoundException("Student is not exists with the given id : " + id));

        student.setName(updatedStudent.getName());
        student.setAge(updatedStudent.getAge());
        student.setContact(updatedStudent.getContact());
        student.setAddress(updatedStudent.getAddress());
        
        Student updatedStudentObj = studentRepository.save(student);

        return StudentMapper.mapToStudentDto(updatedStudentObj);
    }

    /*
     * Deletes a student by ID.
     * @param id The ID of the student to delete.
     * @throws ResourceNotFoundException if the student with the given ID does not exist.
     */

    @Override
    public void deleteStudent(int id) {
        Student student = studentRepository.findById(id).orElseThrow(() ->
                        new ResourceNotFoundException("Student is not exists with the given id : " + id));

        studentRepository.deleteById(id);
    }
}
