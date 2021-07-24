package com.cybertek.step_definitions;

import com.cybertek.pages.DropdownPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    LibraryLoginPage loginPage = new LibraryLoginPage();
    DropdownPage dropdownPage = new DropdownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {

      //1- Get the dropdown as a select object
       Select monthDropdown = new Select(dropdownPage.month);

       //2- Get all the options from the dropdown and store as a List
       List<WebElement> actualMonthsAsWebElement = monthDropdown.getOptions();

        Assert.assertEquals(expectedList, BrowserUtils.getElementsText(actualMonthsAsWebElement));
//
//       //3- convert actualMonthsAsWebElement from List<WebElement> to List<String>
//        List<String> actualMonthsAsString = new ArrayList<>();
//
//        for (WebElement each : actualMonthsAsWebElement) {
//            actualMonthsAsString.add(each.getText());
//        }
//
//        Assert.assertEquals(expectedList, actualMonthsAsString);


    }

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


        loginPage.emailInput.sendKeys(loginInfo.get("username"));
        loginPage.passwordInput.sendKeys(loginInfo.get("password"));

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
