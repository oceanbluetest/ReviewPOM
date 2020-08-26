Feature: Home Page tests

  Scenario: Testing title of the page
    Given I open homepage
    Then I verify title is "Toxic Sushi"

    @verifyNavButtons
  Scenario: Navigation buttons test
    Given I open homepage
    When Verify following navigation buttons are enabled:
      | Home               |
      | Search Restaurants |
      | Search Fun Places  |
      | My Favorites       |