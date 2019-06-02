package com.controller;

import com.enties.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD
=======
import org.springframework.web.multipart.MultipartFile;
>>>>>>> 第二次

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private Student student;
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    Student add(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("sex") String sex, @RequestParam("birth") Date birth) {
        System.out.println("test");
<<<<<<< HEAD
        student = new Student(id, name, sex, birth);
=======
>>>>>>> 第二次
        System.out.println(student);
        studentService.addStudent(student);
        return student;
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String queryStudent(ModelMap modelMap) {
        List<Student> students = new ArrayList<>();
        students = studentService.query();
        modelMap.addAttribute("student", students);
        return "index";
    }

    @RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
    public String delStudent(@PathVariable Integer id) {
         studentService.deleteStudent(id);
         return "redirect:/student/query";
    }
    @RequestMapping(value = "/edit/{id}",method = RequestMethod.POST)
<<<<<<< HEAD
    public String editStudent(@PathVariable Integer id,@RequestParam("name") String name, @RequestParam("sex") String sex, @RequestParam("birth") Date birth)
    {
        student=new Student(id,name,sex,birth);
=======
    public String editStudent(@PathVariable Integer id, @RequestParam("name") String name, @RequestParam("sex") String sex, @RequestParam("birth") Date birth, @RequestParam("file") MultipartFile file)
    {
>>>>>>> 第二次
        System.out.println(student.toString());
        studentService.editStudent(student);
        return "redirect:/student/query";
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public String getId(@PathVariable Integer id, Model model)
    {
        System.out.println(id);
        model.addAttribute("sid",id);
        return "edit";
    }
}
