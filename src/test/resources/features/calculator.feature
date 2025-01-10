# This is a feature file - which describes the behavior we want to test
# The lines starting with 'Given', 'When', 'Then' are keywords that indicate the steps
# of the test. The text after these keywords is the step description.


Feature: Calculator Operations
  As a user
  I want to perform basic calculations
  So that I can get accurate results

  # Each scenario is a test case
  Scenario: Adding two numbers
    Given I have a calculator
    When I add 3 and 3
    Then the result should be 6

  Scenario: Subtracting numbers
    Given I have a calculator
    When I subtract 9 from 15
    Then the result should be 6

  Scenario: Multiplying numbers
    Given I have a calculator
    When I multiply 3 and 3
    Then the result should be 9

  Scenario: Dividing numbers
    Given I have a calculator
    When I divide 35 by 5
    Then the result should be 7

  # Testing error conditions
  Scenario: Division by zero
    Given I have a calculator
    When I divide 10 by 0
    Then it should throw an arithmetic exception