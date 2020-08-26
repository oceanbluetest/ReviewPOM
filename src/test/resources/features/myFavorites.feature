Feature: My Favorites tests
  @myFavoriteTest
  Scenario: Verify list is empty when use doesn't sign in
    Given I open homepage
    When I open "My Favorites" page
    Then I verify "No favorites to display" text is displayed