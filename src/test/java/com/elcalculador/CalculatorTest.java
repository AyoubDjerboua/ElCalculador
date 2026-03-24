package com.elcalculador;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void additionWorks() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void subtractionWorks() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
    }
}
