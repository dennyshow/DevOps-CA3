package com.example.calculator;

import com.example.calculator.controller.CalculatorController;
import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorControllerTest {

    @InjectMocks
    private CalculatorController calculatorController;

    @Mock
    private CalculatorService calculatorService;

    @Mock
    private Model model;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCalculate() {
        double operand1 = 5;
        double operand2 = 3;
        String operator = "+";
        double expectedResult = 8;

        when(calculatorService.calculate(operand1, operand2, operator)).thenReturn(expectedResult);

        String viewName = calculatorController.calculate(operand1, operand2, operator, model);

        assertEquals("calculator", viewName);
        verify(model).addAttribute("result", expectedResult);
    }
}