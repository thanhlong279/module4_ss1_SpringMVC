package com.example.ex1_money_conversion.controllers;

import com.example.ex1_money_conversion.models.Student;
import com.example.ex1_money_conversion.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// đánh dấu đây là 1 controller (1 bean)
// annotation controller
@Controller
public class StudentController {
    //cơ chế DI(dependence injection): tiêm phụ thuộc để giảm sự phụ thuộc
    @Autowired
    private IStudentService studentService;

    // cách 1 model
//    @GetMapping("/student")
//    public String displayAllStudent(Model model) {
//        List<Student> students = studentService.findAll();
//        model.addAttribute("students", students);
//        return "student/list";
//    }
    // cach 2: su dung ModelMap
    @GetMapping("/student")
    public String displayAllStudent(ModelMap modelMap) {
        List<Student> students = studentService.findAll();
        modelMap.put("students", students);
        return "student/list";
    }
}
