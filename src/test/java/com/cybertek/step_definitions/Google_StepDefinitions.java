package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @Given("User is on Google homepage")
    public void user_is_on_google_homepage() {

        Driver.getDriver().get("https://www.google.com");

    }
    @When("User searches for apple")
    public void user_searches_for_apple() {

        googleSearchPage.searchBar.sendKeys("apple" + Keys.ENTER);

    }
    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {

        String actualtitle = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";

        Assert.assertTrue(actualtitle.contains(expectedInTitle));


    }


    @When("User searches for {string}")
    public void userSearchesFor(String arg0) {
        googleSearchPage.searchBar.sendKeys(arg0 + Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String arg0) {

        String actualtitle = Driver.getDriver().getTitle();
        String expectedInTitle = arg0;

        Assert.assertTrue(actualtitle.contains(expectedInTitle));
    }
}
