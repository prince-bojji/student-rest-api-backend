/*
 * This interface extends JpaRepository, which provides CRUD operations for 
 * the `Student` entity.
 * 
 * It allows interaction with the database using methods like save, findById, findAll, 
 * etc., without writing explicit queries.
 */

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
