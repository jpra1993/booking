Feature: create account on booking website
  As a user of the reservation website
  I need to create an account
  to search for accommodation and flights

  @createAccount
  Scenario: Create account
    Given The user is in the home page
    When The user enter the email and password
    Then The user he will see the welcome message correctly

  @RegistrationWithSocialNetworks
  Scenario Outline: Registration with <registrationOption>
    Given The user is in the login option
    When The user registers with <registrationOption>
    Then The user he will see the profile
    Examples: data
      | registrationOption |
      | Facebook           |
      | Google             |
      | Apple              |

  @CreateAccountWithoutMatchingPasswords
  Scenario: Create account without matching passwords
    Given The user is in the home page
    When The user enters the email and passwords that do not match
    Then The user he will see the error message correctly
