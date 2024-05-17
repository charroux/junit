package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    Calculatrice calculatrice;

    @BeforeEach
    void init(){
        calculatrice = new Calculatrice();
    }

    @Test
    void test(){
        assertTrue(calculatrice.add(1, 1) == 2);
        assertEquals(2, calculatrice.add(1, 1));
        assertAll("calculs",
                () -> assertEquals(2, calculatrice.add(1, 1)),
                () -> assertEquals(2, calculatrice.div(4,2))
        );
    }

    @Test
    void test1(){
        Exception exception = assertThrows(Exception.class, () ->
                calculatrice.div(1,0));
        assertEquals("Div par O", exception.getMessage());
    }
}
