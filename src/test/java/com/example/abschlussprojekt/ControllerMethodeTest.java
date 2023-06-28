package com.example.abschlussprojekt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerMethodeTest {

    @Test
    void testFactor(){
        ControllerMethode fa = new ControllerMethode();
        assertEquals(0,fa.getTotal());
        assertEquals(120,fa.getFactor(5));
        assertEquals(24,fa.getFactor(4));
        assertEquals(720,fa.getFactor(6));
        assertEquals(5040,fa.getFactor(7));
        assertEquals(5904,fa.getTotal());
    }

}