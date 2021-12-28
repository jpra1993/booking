Feature: search taxi in to the booking website
  As a user of the reservation website
  I need to search taxi rental
  to enjoy a vacations

  @RentATaxi
  Scenario: Rent a taxi at the airport
    Given The user is in home page
    When The user selects the option rent a taxi
    And The user enters the taxi search criteria
    Then The user will see the list of available taxis