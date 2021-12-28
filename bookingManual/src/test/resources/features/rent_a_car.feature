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

  @RentACarWithFilters
  Scenario: Rent a car with filters
    Given The user is in home page
    When The user selects the option rent a car
    And The user enters the car search criteria
    And The user filters the search by car size and payment method
    Then The user will see the detailed list of available cars

  @RentACarWithNoPlaceOfOrigin
  Scenario: Rent a car with not place origin
    Given The user is in home page
    When The user selects the option rent a car
    And The user enters the start date and end date of the rental but not the origin
    Then The user will see the error message correctly