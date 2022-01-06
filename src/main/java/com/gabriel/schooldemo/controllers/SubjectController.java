package com.gabriel.schooldemo.controllers;

import com.gabriel.schooldemo.models.Subject;
import com.gabriel.schooldemo.repositories.SubjectRespository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subjects")
public class SubjectController {
    @Autowired
    private SubjectRespository subjectRespository;

    @GetMapping
    public List<Subject> findAll() {
        return subjectRespository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Subject getSubject(@PathVariable Integer id) {
        return subjectRespository.getById(id);
    }

    @PostMapping
    public Subject create(@RequestBody Subject subject) {
        return subjectRespository.saveAndFlush(subject);
    }

    @DeleteMapping
    public void delete(@PathVariable Integer id) {
        subjectRespository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Subject update(@PathVariable Integer id, @RequestBody Subject subject) {
        Subject existingSubject = subjectRespository.getById(id);
        BeanUtils.copyProperties(subject, existingSubject, "subject_id");
        return subjectRespository.saveAndFlush(existingSubject);
    }
}
