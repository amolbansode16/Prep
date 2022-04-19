Feature: Calculator feature
Scenario Outline: make calculations of number

Given two numbers
When user enter <num1> and <num2> and "<operator>"
Then user get result

Examples:
|num1|num2|operator|
|2|3|+|
|3|4|*|