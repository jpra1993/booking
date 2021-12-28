Feature: search car in to the booking website
  As a user of the reservation website
  I need to search car rental
  to enjoy a vacations

  @RentACar
  Scenario: Rent a car
    Given The user is in home page
    When The user selects the option rent a car
    And The user enters the car search criteria
    Then The user will see the list of available cars