package ru.proj.springstud.service;

import org.springframework.stereotype.Service;
import ru.proj.springstud.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail (String email);
    Student updateStudent (Student student);
    void deleteStudent (String email);
}
