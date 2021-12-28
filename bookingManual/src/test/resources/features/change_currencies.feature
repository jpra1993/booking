Feature: change currencies in to the booking website
  As a user of the reservation website
  I need to change currencies
  to buy a vacations

  @ChangeCurrencies
  Scenario Outline: Change currencies <Currencies>
    Given The user is in home page
    When The user change currencies <Currencies>
    Then The user will see the website in
    Examples: data
      | Currencies    |
      | Euro          |
      | Peso mexicano |
      | Dolar de EEUU |