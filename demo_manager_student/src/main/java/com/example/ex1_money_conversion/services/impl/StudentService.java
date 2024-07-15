package com.example.ex1_money_conversion.services.impl;

import com.example.ex1_money_conversion.models.Student;
import com.example.ex1_money_conversion.repositories.IStudentRepository;
import com.example.ex1_money_conversion.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    IStudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void updateStudent(Student student, int id) {
        studentRepository.updateStudent(student, id);
    }
}
