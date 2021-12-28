Feature: change language on booking website
  As a user of the reservation website
  I need to change the language
  to navigate in the language of my preference

  @ChangeLanguage
  Scenario Outline: Change language <Language>
    Given The user is in the home page
    When The user change language <Language>
    Then The user will see the prices in the currency of their choice.
    Examples: data
      | Language     |
      | English (UK) |
      | English (US) |
      | Deutsch      |