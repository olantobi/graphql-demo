package com.liferon.graphqldemo.service;

import com.liferon.graphqldemo.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentDetailsByName(String name);

    Student createStudentRecord(Student student);
}
