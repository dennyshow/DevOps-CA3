package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

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
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.calculate(1, 0, "/"));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.calculate(1, 1, "%"));
        assertEquals("Invalid operator: %", exception.getMessage());
    }
}