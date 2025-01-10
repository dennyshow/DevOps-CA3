package com.example.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest {
    private WebDriver driver;

    @BeforeEach
    public void setup(){
        // 1. Start the session
        driver = new ChromeDriver();
    }

    @Test
    public void testHomePage() {
        // 2. Take action on browser - navigate to home page
        driver.get("http://localhost:8080");

        // 3. Request browser information
        String pageTitle = driver.getTitle();
        assertEquals("Calculator", pageTitle);

        // 4. Find elements
        WebElement heading = driver.findElement(By.tagName("h2"));
        WebElement paragraph = driver.findElement(By.tagName("form"));

        // 5. Request element information
        assertEquals("Simple Calculator", heading.getText());
        assertTrue(paragraph.getText().contains("Calculate"));
    }

    @AfterEach
    public void teardown() {
        // 6. End the session
        if (driver != null) {
            driver.quit();
        }
    }
}