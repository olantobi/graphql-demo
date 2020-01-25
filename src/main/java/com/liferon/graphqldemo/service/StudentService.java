package com.liferon.graphqldemo.service;

import com.liferon.graphqldemo.model.Student;

public interface StudentService {
    Student getStudentDetailsByName(String name);

    Student createStudentRecord(Student student);
}
