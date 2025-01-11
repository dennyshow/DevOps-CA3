package com.example.calculator.selenium.tests;

import com.example.calculator.selenium.pages.CalculatorPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorWorkflowTest {
    private ChromeDriver driver;
    private CalculatorPage calculatorPage;

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run without GUI
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-extensions");

        // Initialize the driver before passing it to CalculatorPage
        driver = new ChromeDriver(options);

        // Pass the initialized driver to CalculatorPage
        calculatorPage = new CalculatorPage(driver);

        // Navigate to the calculator app
        driver.get("http://localhost:8080");
    }

    @Test
    @DisplayName("User can perform addition operation")
    public void testAddition() {
        calculatorPage.isAtCalculatorPage();

        calculatorPage.calculate("5", "3", "+");

        String result = calculatorPage.getResult();
        assertEquals("8.0", result, "Result of addition should be 8.0");
    }

    @Test
    @DisplayName("User can perform subtraction operation")
    public void testSubtraction() {
        calculatorPage.isAtCalculatorPage();

        calculatorPage.calculate("10", "4", "-");

        String result = calculatorPage.getResult();
        assertEquals("6.0", result, "Result of subtraction should be 6.0");
    }

    @Test
    @DisplayName("User can perform multiplication operation")
    public void testMultiplication() {
        calculatorPage.isAtCalculatorPage();

        calculatorPage.calculate("10", "10", "*");

        String result = calculatorPage.getResult();
        assertEquals("100.0", result, "Result of multiplication should be 100.0");
    }

    @Test
    @DisplayName("User can perform division operation")
    public void testDivision() {
        calculatorPage.isAtCalculatorPage();

        calculatorPage.calculate("20", "10", "/");

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
