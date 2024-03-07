package com.example.demo.dto;

/*
 * This class is a data transfer object used to transfer data 
 * between layers (e.g., controller, service, repository).
 * 
 * It mirrors the structure of the `Student` entity but is meant 
 * for transferring data across different layers, often used in RESTful APIs.
 * 
 * It doesn't contain any persistence annotations (`@Entity`, etc.) 
 * as it's not an entity but a plain Java object.
 */

public class StudentDto {
    private int id;
    private String name;
    private int age;
    private String contact;
    private String address;

    public StudentDto(int id, String name, int age, String contact, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
    }

    public StudentDto() {
        
    }
    
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
