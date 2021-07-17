package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPages;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);
    }

    WikiSearchPages wikiSearchPages = new WikiSearchPages();

   // @When("User types Steve Jobs in the wiki search box")
  //  public void user_types_steve_jobs_in_the_wiki_search_box() {
    //    wikiSearchPages.searchBox.sendKeys("Steve Jobs");

   // }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPages.searchButton.click();

    }
  //  @Then("User sees Steve Jobs is in the wiki title")
   // public void user_sees_steve_jobs_is_in_the_wiki_title() {

   //     String expectedTitle = "Steve Jobs";
   //     String actualTitle = Driver.getDriver().getTitle();

  //      Assert.assertTrue(actualTitle.contains(expectedTitle));

  //  }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikiSearchPages.searchBox.sendKeys(arg0);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {

        String expectedTitle = arg0 + " - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {

        String expectedMainHeader = arg0;
        String actualMainHeader = wikiSearchPages.mainHeader.getText();

        Assert.assertEquals(expectedMainHeader, actualMainHeader);


    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String arg0) {

        String expectedImageheader = arg0;
        String actualImageHeader = wikiSearchPages.imageHeader.getText();

        Assert.assertEquals(expectedImageheader, actualImageHeader);


    }
}
