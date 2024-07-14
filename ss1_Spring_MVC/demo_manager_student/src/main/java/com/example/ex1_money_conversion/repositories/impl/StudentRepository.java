package com.example.ex1_money_conversion.repositories.impl;

import com.example.ex1_money_conversion.models.Student;
import com.example.ex1_money_conversion.repositories.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList();

    static {
        students.add(new Student(1, "Long", "TH", 9));
        students.add(new Student(2, "Long1", "TH", 7));
        students.add(new Student(3, "Long2", "TH", 6));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }
}
