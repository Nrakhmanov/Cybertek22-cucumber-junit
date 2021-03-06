
@regression @smoke @login
Feature: Library app login feature
  User story :
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  #THIS IS HOW WE COMMENT IN A FEATURE FILE

  Background: Assuming user is on the login page
    Given User is on the login page

@librarian @employee
  Scenario: login as a librarian
    When User enters librarian username
    And User enters librarian password
    Then User should see the dashboard

@student
  Scenario: login as a student
    When User enters student username
    And User enters student password
    Then User should see the dashboard

  @admin @employee
  Scenario: login as an admin
    When User enters admin username
    And User enters admin password
    Then User should see the dashboard