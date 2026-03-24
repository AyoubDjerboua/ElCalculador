package com.elcalculador;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void additionWorks() {
        Calculator calculator = new Calculator();
        assertEquals(23, calculator.addition(22, 1));
    }

    @Test
    void soustractionWorks() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.soustraction(3, 2));
    }

    @Test
    void multiplicationWorks() {
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiplication(2, 10));
    }

    @Test
    void divisionWorks() {
        Calculator calculator = new Calculator();
        assertEquals(50, calculator.division(100, 2));
    }

    @Test
    void divisionByZeroThrowsException() {
        Calculator calculator = new Calculator();
        assertEquals("Division par zéro non autorisée", 
            assertThrows(IllegalArgumentException.class, () -> {
                calculator.division(10, 0);
            }).getMessage());
    }
}
