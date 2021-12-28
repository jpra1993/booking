Feature: search tourist attractions in to the booking website
  As a user of the reservation website
  I need to search tourist attractions
  to enjoy a vacations

  @SearchTourInMexico
  Scenario: Search tour in Mexico
    Given The user is in home page
    When The user enter the search criteria of the tourist attractions on Tequila, Jalisco
    And The user select tour por tequila y una destileria
    Then The user will see the tour in Tequila Jalisco they are looking for

  @SearchTourInCancunWithFilters
  Scenario: Search tour in Cancun with filters
    Given The user is in home page
    When The user enter the search criteria of the tourist attractions on Cancun
    And The user selects the option of price and the free cancellation
    And The user select Tour por las ruinas de Tulum y dos cenotes
    Then The user will see the tour in Cancun they are looking for