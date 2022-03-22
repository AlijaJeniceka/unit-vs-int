package alija.dev.unitvsint.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        HelloController controller = new HelloController();//Arrange
        String response = controller.hello("World");//Act
        //Assert
        assertEquals("Hello, World", response);

    }
}