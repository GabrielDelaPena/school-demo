package com.gabriel.schooldemo.repositories;

import com.gabriel.schooldemo.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRespository extends JpaRepository<Subject, Integer> {
}
