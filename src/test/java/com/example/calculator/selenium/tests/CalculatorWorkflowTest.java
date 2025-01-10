package com.example.calculator.selenium.tests;

import com.example.calculator.selenium.pages.CalculatorPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorWorkflowTest {
    private WebDriver driver;
    private CalculatorPage calculatorPage; // Updated type

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Adjusted implicit wait
        calculatorPage = new CalculatorPage(driver);
        driver.get("http://localhost:8080"); // Navigate to the calculator app
    }

    @Test
    @DisplayName("User can perform addition operation")
    public void testAddition() {
        // Given: user is on the calculator page
        calculatorPage.isAtCalculatorPage(); // Fixed reference

        // When: user enters numbers and selects addition
        calculatorPage.calculate("5", "3", "+");

        // Then: result should be correct
        String result = calculatorPage.getResult();
        assertEquals("8.0", result, "Result of addition should be 8.0");
    }

    @Test
    @DisplayName("User can perform subtraction operation")
    public void testSubtraction() {
        // Given: user is on the calculator page
        calculatorPage.isAtCalculatorPage(); // Fixed reference

        // When: user enters numbers and selects subtraction
        calculatorPage.calculate("10", "4", "-");

        // Then: result should be correct
        String result = calculatorPage.getResult();
        assertEquals("6.0", result, "Result of subtraction should be 6.0");

    }

    @Test
    @DisplayName("User can perform subtraction operation")
    public void testMultiplication() {
        // Given: user is on the calculator page
        calculatorPage.isAtCalculatorPage(); // Fixed reference

        // When: user enters numbers and selects multiplication
        calculatorPage.calculate("10", "10", "*");

        // Then: result should be correct
        String result = calculatorPage.getResult();
        assertEquals("100.0", result, "Result of multiplication should be 100.0");

    }

    @Test
    @DisplayName("User can perform subtraction operation")
    public void testDivision() {
        // Given: user is on the calculator page
        calculatorPage.isAtCalculatorPage(); // Fixed reference

        // When: user enters numbers and selects division
        calculatorPage.calculate("20", "10", "/");

        // Then: result should be correct
        String result = calculatorPage.getResult();
        assertEquals("2.0", result, "Result of division should be 2.0");

    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
