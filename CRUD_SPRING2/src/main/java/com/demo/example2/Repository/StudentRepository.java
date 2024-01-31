package com.demo.example2.Repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.example2.Entity.Student;

public interface StudentRepository extends CrudRepository <Student, Long>{

}
