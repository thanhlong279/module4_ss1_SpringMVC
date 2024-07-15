package com.example.ex1_money_conversion.controllers;

import com.example.ex1_money_conversion.models.Student;
import com.example.ex1_money_conversion.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

// đánh dấu đây là 1 controller (1 bean)
// annotation controller
@Controller
@RequestMapping(value = "/student")
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
    @GetMapping("")
    public String displayAllStudent(ModelMap modelMap) {
        List<Student> students = studentService.findAll();
        modelMap.put("students", students);
        return "student/list";
    }

    @GetMapping("/create")
    public String showCreate(){
        return "student/create";
    }

    @PostMapping("/create")
    public String createStudent(@RequestParam("name") String name,
                                @RequestParam("address") String address,
                                @RequestParam("point") float point,
                                Model model, RedirectAttributes redirectAttributes){
        Student student = new Student(name, address, point);
        studentService.saveStudent(student);
        redirectAttributes.addFlashAttribute("message", "thêm mới thành công");
        return "redirect:/student";
    }

    @GetMapping("/update/{id}")
    public String showEdit(@PathVariable("id")int id,
                           Model model){
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "student/edit";
    }

    @PostMapping("update/{id}")
    public String updateStudent(@RequestParam("name") String name,
                                @RequestParam("address") String address,
                                @RequestParam("point") float point,
                                Model model, RedirectAttributes redirectAttributes,
                                @PathVariable("id")int id){
        Student student = studentService.findById(id);
        if(student == null){
            redirectAttributes.addFlashAttribute("message", "thêm mới thất bại");
        }else{
            student.setName(name);
            student.setAddress(address);
            student.setPoint(point);
            studentService.updateStudent(student, id);
            redirectAttributes.addFlashAttribute("message", "thêm mới thành công");
        }
        return "redirect:/student";
    }
}
