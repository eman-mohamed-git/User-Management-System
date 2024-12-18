package com.example.zagMProject.servicetest;

import com.example.zagMProject.model.User;
import com.example.zagMProject.repository.UserRepository;
import com.example.zagMProject.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testFindUserById() {
        User user = new User(1, "tamermohamed", "2468", "tamermohamed@yahoo.com",
                "Tamer Mohamed", "1235560", "Admin", "Male", "Active");

//        when(userRepository.getUserById(1)).thenReturn(Optional.of(user));

        Optional<User> found = Optional.ofNullable(userService.findUserById(1));
        assertTrue(found.isPresent());
        assertEquals("johndoe", found.get().getUserUsername());
    }
}
