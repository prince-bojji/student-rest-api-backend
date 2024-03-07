/*
 * This class represents the entity `Student`, which has attributes 
 * such as id, name, age, contact, and address.
 * 
 * It is annotated with JPA annotations such as @Entity, @Table, @Id, and @Column 
 * to define its mapping to the database table.
 */

package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;

    @Column(name = "stud_name")
    private String name;

    @Column(name = "stud_age")
    private int age;

    @Column(name = "stud_contact", nullable = false, unique = true)
    private String contact;

    @Column(name = "stud_address")
    private String address;

    /*
     * Constructor for all the fields of a student object and no args constructor.
     */

    public Student(int id, String name, int age, String contact, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
    }

    public Student() {

    }

    /*
     * Setters and Getters for all the fields of a student object.
     */

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
