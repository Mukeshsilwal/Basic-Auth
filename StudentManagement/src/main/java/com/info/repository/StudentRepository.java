package com.info.repository;



import com.info.payloads.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;

import com.info.entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer>{

    Optional<Student> findByEmail(String email);
}
