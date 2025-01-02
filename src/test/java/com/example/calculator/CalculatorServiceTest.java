package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAddition() {
        assertEquals(5, calculatorService.calculate(2, 3, "+"));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculatorService.calculate(3, 2, "-"));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculatorService.calculate(2, 3, "*"));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculatorService.calculate(6, 3, "/"));
    }

    @Test
    void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.calculate(1, 1, "%"));
        assertEquals("Invalid operator: %", exception.getMessage());
    }
}