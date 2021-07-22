package com.cybertek.step_definitions;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    LibraryLoginPage loginPage = new LibraryLoginPage();

    @Given("User is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {

        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);

    }
    @When("User enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String, String> loginInfo) {

      // String username = loginInfo.get("username");
      // loginPage.username.sendKeys(username);
      //  String password = loginInfo.get("password");
      //  loginPage.password.sendKeys(password);


        loginPage.username.sendKeys(loginInfo.get("username"));
        loginPage.password.sendKeys(loginInfo.get("password"));

        loginPage.submitButton.click();

    }
    @Then("User should see title is Library")
    public void user_should_see_title_is_something() {

        String expectedTitle = "Library";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {

        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);
    }

}
