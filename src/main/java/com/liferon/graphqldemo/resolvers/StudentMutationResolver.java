package com.liferon.graphqldemo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.liferon.graphqldemo.model.Student;
import com.liferon.graphqldemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentMutationResolver implements GraphQLMutationResolver {
    private final StudentService studentService;

    public Student createStudent(Student student) {
        return studentService.createStudentRecord(student);
    }
}
