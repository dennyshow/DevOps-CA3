package com.example.calculator.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class CalculatorPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "operand1")
    private WebElement number1Input;

    @FindBy(id = "operand2")
    private WebElement number2Input;

    @FindBy(id = "operator")
    private WebElement operationDropdown;

    @FindBy(css = "button")
    private WebElement calculateButton;

    @FindBy(css = "span")
    private WebElement resultLabel;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void calculate(String number1, String number2, String operation) {
        wait.until(ExpectedConditions.visibilityOf(number1Input));
        number1Input.clear();
        number1Input.sendKeys(number1);
        
        number2Input.clear();
        number2Input.sendKeys(number2);
        
        wait.until(ExpectedConditions.elementToBeClickable(operationDropdown));
        operationDropdown.sendKeys(operation);

        wait.until(ExpectedConditions.elementToBeClickable(calculateButton));
        calculateButton.click();
        
    }

    public String getResult() {
        wait.until(ExpectedConditions.visibilityOf(resultLabel));
        return resultLabel.getText();
    }

    public boolean isAtCalculatorPage() {
        wait.until(ExpectedConditions.visibilityOf(number1Input));
        return driver.getCurrentUrl().contains("/calculate");
    }
}
