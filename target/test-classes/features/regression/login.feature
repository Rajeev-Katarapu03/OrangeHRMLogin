Feature: To login OrangeHRMLive.

Scenario: To validate login functionality using valid credentials.

Given user start chrome browser
And user launch app using url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And user enters text "Admin" in textbox using xpath "//input[@name='username']"
And user enters text "admin123" in textbox using xpath "//input[@name='password']"
When  user clicks login button using xpath "//button[@type='submit']"
Then user verifies title to be "OrangeHRM"


 



