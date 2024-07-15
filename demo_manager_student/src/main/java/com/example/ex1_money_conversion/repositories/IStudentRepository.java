package com.example.ex1_money_conversion.repositories;

import com.example.ex1_money_conversion.models.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();

    void saveStudent(Student student);

    Student findById(int id);

    void updateStudent(Student student, int id);
}
