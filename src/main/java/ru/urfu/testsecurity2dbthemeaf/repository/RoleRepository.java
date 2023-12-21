package ru.urfu.testsecurity2dbthemeaf.repository;


import ru.urfu.testsecurity2dbthemeaf.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByNane(String name);
}
