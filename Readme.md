## Spring Boot Demo Application

This is a simple Spring Boot application that demonstrates the usage of Spring Data JPA and Hibernate. The application provides CRUD (Create, Read, Update, Delete) operations for managing student entities.

### Features

- **_Create Student:_** Add a new student with details such as name, age, contact, and address.
- **_Retrieve Student:_** Retrieve student details by ID.
- **_Retrieve All Students:_** Retrieve details of all students.
- **_Update Student:_** Update student details.
- **_Delete Student:_** Delete a student by ID.

### Technologies Used

- **_Spring Boot:_** Framework for creating stand-alone, production-grade Spring-based applications.
- **_Spring Data JPA:_** Simplifies the implementation of data access layers by providing JPA-based repositories.
- **_Hibernate:_** ORM (Object-Relational Mapping) framework for mapping Java objects to database tables.

### Endpoints

### Create Student

```bash
POST /api/students
```

### Request Body:

```bash
{
  "name": "Jehan S. Batang",
  "age": 21,
  "contact": "09122237027",
  "address": "Kalokohan City"
}
```

### Retrieve Student by ID

```bash
GET /api/students/{id}
```

### Retrieve All Students

```bash
GET /api/students
```

### Update Student

```bash
PUT /api/students/{id}
```

### Request Body:

```bash
{
  "name": "Jehan Batang",
  "age": 21,
  "contact": "09456009512",
  "address": "Caloocan City"
}
```

### Delete Student

```bash
DELETE /api/students/{id}
```