/*
 * This class provides methods to map between `Student` entity and `StudentDto`.
 * 
 * It has two static methods: `mapToStudentDto` maps `Student` entity to `StudentDto`, 
 * and `mapToStudent` maps `StudentDto` to `Student`.
 * 
 * These methods facilitate conversion between the entity and DTO, enabling seamless 
 * data transfer between layers.
 */

package com.example.demo.mapper;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;

public class StudentMapper {
    
    /*
     * Maps a Student entity to a StudentDto.
     * @param student The Student entity to map.
     * @return The resulting StudentDto.
     */

    public static StudentDto mapToStudentDto(Student student){
        return new StudentDto(
            student.getId(),
            student.getName(),
            student.getAge(),
            student.getContact(),
            student.getAddress()
        );
    }

    /*
     * Maps a StudentDto to a Student entity.
     * @param studentDto The StudentDto to map.
     * @return The resulting Student entity.
     */

    public static Student mapToStudent(StudentDto studentDto){
        return new Student(
            studentDto.getId(),
            studentDto.getName(),
            studentDto.getAge(),
            studentDto.getContact(),
            studentDto.getAddress()
        );
    }
}
