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

    @Override
    public void saveStudent(Student student) {
        student.setId(students.get(students.size() - 1).getId());
        students.add(student);
    }

    @Override
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(Student student, int id) {
        for (Student stud : students) {
            if (stud.getId() == id) {
                stud.setId(student.getId());
                stud.setName(student.getName());
                stud.setAddress(student.getAddress());
                stud.setPoint(student.getPoint());
            }
        }
    }
}
