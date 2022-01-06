package com.gabriel.schooldemo.controllers;

import com.gabriel.schooldemo.models.Student;
import com.gabriel.schooldemo.repositories.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Student getStudent(@PathVariable Integer id) {
        return studentRepository.getById(id);
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentRepository.saveAndFlush(student);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        studentRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Student update(@PathVariable Integer id, @RequestBody Student student) {
        Student existingStudent = studentRepository.getById(id);
        BeanUtils.copyProperties(student, existingStudent, "student_id");
        return studentRepository.saveAndFlush(existingStudent);
    }


}
