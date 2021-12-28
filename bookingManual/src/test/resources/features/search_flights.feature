Feature: search flights in to the booking website
  As a user of the reservation website
  I need to search flights
  to enjoy a vacations

  @SearchFlights
  Scenario: Search flights
    Given The user is in home page
    When The user selects the option flights
    And The user enters the flight search data
    Then The user will see the list of available flights

  @SearchFlightsWithFilters
  Scenario: Search flights with filters
    Given The user is in home page
    When The user selects the option flights
    And The user enters the flight search data
    And The user selects the option of stopovers and the price
    Then The user will see the list of available flights

  @SearchFlightsWithoutDestiny
  Scenario: Search flights without destiny
    Given The user is in home page
    When The user selects the option flights
    And The user enters the flight search data without a destination city
    Then The user will see the error message correctly