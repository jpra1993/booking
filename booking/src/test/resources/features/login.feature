Feature: log in to the booking website
  As a user of the reservation website
  I need to login
  to use the services offered

  @successfulLogin
  Scenario: Successful login
    Given is in the home page
    When enter credentials
      | email             | password   |
      | prueba4@gmail.com | Orionn1993 |
    Then he will see the profile correctly

  @failedLogin
  Scenario: Failed login
    Given is in the home page
    When enter wrong password
      | email             | password   |
      | prueba2@gmail.com | orion19933 |
    Then he will see the error message