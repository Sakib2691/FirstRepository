Feature: Facebook login functionality test
Scenario: User able to signin with valid credentials
Given go to home page
When user able to enter email
And user able to enter password
And user able to login
Then login should be successful