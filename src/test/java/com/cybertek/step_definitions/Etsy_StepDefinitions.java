package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

    @Given("User is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {

        String url = ConfigurationReader.getProperty("etsyUrl");
        Driver.getDriver().get(url);

    }

    @Then("User should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("title is not as expected", actualTitle.equals(expectedTitle));
        Assert.assertEquals("title is not as expected", actualTitle, expectedTitle);
    }

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.searchBar.sendKeys("Wooden Spoon");

    }
    @When("User clicks to search button")
    public void user_clicks_to_search_button() {
        etsySearchPage.searchButton.click();

    }
    @Then("User sees title is Wooden spoon | Etsy")
    public void user_sees_title_is_wooden_spoon_etsy() {

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("title is not as expected",actualTitle, expectedTitle);

    }

}