Feature: search accommodation in to the booking website
  As a user of the reservation website
  I need to search accommodation
  to enjoy a vacations

  @searchAccommodation
  Scenario: Search accommodation
    Given is in the home page
    When enter the search criteria of the accommodation in Salento
      | destination | checkin    | checkout   |
      | Salento     | 2022-01-10 | 2022-01-14 |
    Then he will see the search results

  @SearchAccommodationsWithConditions
  Scenario: Search accommodation with conditions
    Given is in the home page
    When enter the search criteria of the accommodation in Salento
      | destination | checkin    | checkout   |
      | Salento     | 2022-01-10 | 2022-01-14 |
    And select filter options
    Then he will see specific search results