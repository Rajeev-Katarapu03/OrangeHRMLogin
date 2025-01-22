Feature: PIM Module

Scenario: Add a new employee to the system

Given user logged in as admin
When user clicks on pim button using xpath "//span[text()='PIM']"
And user clicks on Add Employee button using xpath "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"
When  user enters firstname "drijo" in textbox using xpath "//input[@name='firstName']"
When  user enters Lastname "devala" in textbox using xpath "//input[@name='lastName']"
When user clicks on save button using xpath "//button[@type='submit']"

