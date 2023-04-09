package test.java.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.inherit.User;


class MainTest {

    @Test
    void main() {
        User user = new User();
        user.setFirstName("Ali");
        user.setLastName("Khosravani");
        String actual ="Hello "+ user.getFirstName()+" "+user.getLastName();
        String expected = "Hello Ali Khosravani";
        Assertions.assertEquals(expected,actual);
    }
}

