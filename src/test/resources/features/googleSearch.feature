Feature: Google search functionality
  Agile Story: As a user, when I am on the Google search page,
  I should be able to search whatever I want, and see relevant information

  Scenario: Search page title verification
    Given User is on Google homepage
    Then User should see title is Google

  Scenario: User search title verification
    Given User is on Google homepage
    When User searches for apple
    Then User should see apple in the title

    @Google
  Scenario: User search title verification
    Given User is on Google homepage
    When User searches for "wooden spoon"
    Then User should see "wooden spoon" in the title