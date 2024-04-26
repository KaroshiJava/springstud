package ru.proj.springstud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.proj.springstud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
