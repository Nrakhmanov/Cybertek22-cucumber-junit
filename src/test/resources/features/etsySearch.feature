Feature: Etsy search feature

  @wip
  Scenario: Etsy default title verification
    Given User is on the Etsy landing page
    Then User should see Etsy title as expected

    #expected = Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  Scenario: Etsy functionality search verification
    Given User is on the Etsy landing page
    When User types Wooden Spoon in the search box
    And User clicks to search button
    Then  User sees title is Wooden spoon | Etsy
