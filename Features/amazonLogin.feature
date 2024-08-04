Feature: log into an Account
  Scenario Outline: login into amazon Account
    Given i am on amazon Home Page
    When i click on the sign in button from the home page
    And i enetr the "<email_address>" in the email input fiels
    And i click on the continue button
    And i eneter the "<password>" in the password input button
    And i click on the sign in button
    Then i am able to log in my acciunt successfully
    Examples:
    |email_address| password|
    |sony198702@gmail.com|Brooklyn1010$|
    |sony198702@gmail.com|Brooklyn1010$|
    |sony198702@gmail.com|Brooklyn1010$|
    |sony198702@gmail.com|Brooklyn1010$|
    |sony198702@gmail.com|Brooklyn1010$|
    |sony198702@gmail.com|Brooklyn1010$|

