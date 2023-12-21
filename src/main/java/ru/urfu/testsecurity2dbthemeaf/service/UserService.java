package ru.urfu.testsecurity2dbthemeaf.service;

import ru.urfu.testsecurity2dbthemeaf.dto.UserDto;
import ru.urfu.testsecurity2dbthemeaf.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
