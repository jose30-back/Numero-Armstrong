package dev.personal.java.numero.armstrong.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class NumberAmrstrongTest {

    NumberAmrstrong model = new NumberAmrstrong();

    @Test
    void testIsArmstrong() {

         assertEquals("El numero es armstrong", model.isArmstrong(153));
    }
}
