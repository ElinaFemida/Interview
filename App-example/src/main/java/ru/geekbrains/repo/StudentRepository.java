package ru.geekbrains.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
