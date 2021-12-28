Feature: log in to the booking website
  As a user of the reservation website
  I need to login
  to use the services offered

  @loginWithSocialNetworks
  Scenario Outline: login with <registrationOption>
    Given The user is in the login option
    When The user logs in with <registrationOption>
    Then The user he will see the profile
    Examples: Data
      | registrationOption |
      | Facebook           |
      | Google             |
      | Apple              |