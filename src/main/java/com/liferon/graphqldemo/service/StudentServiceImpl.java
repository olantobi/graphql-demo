package com.liferon.graphqldemo.service;

import com.liferon.graphqldemo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    private Map<String, Student> map = new HashMap<>();

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Student getStudentDetailsByName (String name)
    {
        return null != name ? map.get(name) : null;
    }

    @Override
    public Student createStudentRecord (Student student)
    {
        if (null != student) {
            map.put(student.getName(), student);
        }

        return student;
    }
}
