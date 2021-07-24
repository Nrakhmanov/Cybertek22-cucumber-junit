Feature: Examples of Cucumber data table implementations

  @wip
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |


  Scenario: Something happens
    #Given User does something
    Then User should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Strawberry |
      | Mango      |
      | Tomato     |
      | Cucumber   |
    # to Ctrl + alt + L to fix pipes order


  Scenario: Library login example using data table
    Given User is on the login page of library app
    When User enters username and password as below
      | username | librarian13@library |
      | password | 9rf6axdD            |
    Then User should see title is Library

