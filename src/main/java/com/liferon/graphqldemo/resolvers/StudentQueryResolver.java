package com.liferon.graphqldemo.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.liferon.graphqldemo.model.Student;
import com.liferon.graphqldemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StudentQueryResolver implements GraphQLQueryResolver {

    private final StudentService studentService;

    public Student student(String name)
    {
        return studentService.getStudentDetailsByName(name);
    }

    public List<Student> students()
    {
        return studentService.getAllStudents();
    }
}
