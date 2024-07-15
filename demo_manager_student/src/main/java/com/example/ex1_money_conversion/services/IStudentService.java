package com.example.ex1_money_conversion.services;

import com.example.ex1_money_conversion.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void saveStudent(Student student);

    Student findById(int id);

    void updateStudent(Student student, int id);
}
