package ru.urfu.testsecurity2dbthemeaf.repository;


import ru.urfu.testsecurity2dbthemeaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
