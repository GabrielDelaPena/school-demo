package com.gabriel.schooldemo.repositories;

import com.gabriel.schooldemo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
