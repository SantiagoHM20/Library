package edu.eci.cvds.tdd.Library;

import edu.eci.cvds.tdd.library.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("John Doe", "john.doe@example.com");
        user.setName("John Doe");
        user.setId("12345");
    }

    @Test
    void shouldGetName() {
        String name = user.getName();
        assertEquals("John Doe", name);
    }

    @Test
    void shouldGetId() {
        String id = user.getId();
        assertEquals("12345", id);
    }

    @Test
    void shouldSetName() {
        user.setName("Jane Doe");
        String name = user.getName();
        assertEquals("Jane Doe", name);
    }

    @Test
    void shouldSetId() {
        user.setId("67890");
        String id = user.getId();
        assertEquals("67890", id);
    }
}