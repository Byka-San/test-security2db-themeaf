package ru.urfu.testsecurity2dbthemeaf.repository;


import ru.urfu.testsecurity2dbthemeaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
