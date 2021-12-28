Feature: create account on booking website
  As a user of the reservation website
  I need to create an account
  to search for accommodation and flights

  @createAccount
  Scenario: Create account
    Given The user is in the home page
    When The user enter the email and password
    Then The user he will see the welcome message correctly

  @registrationWithSocialNetworks
  Scenario Outline: Registration with <registrationOption>
    When The user registers with <registrationOption>
    Then The user he will see the profile
    Examples: data
      | registrationOption |
      | Facebook           |
      | Google             |
      | Apple              |