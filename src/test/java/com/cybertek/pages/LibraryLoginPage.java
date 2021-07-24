package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    /**
     * This method accepts String expected title
     * @param expectedtitle
     */
    public static void assertTitle(String expectedtitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedtitle, actualTitle);

    }

    /*
    this method returns true or false after assertion
     */
//    public boolean assertTitle(String expectedTitle) {
//
//        String actualTitle = Driver.getDriver().getTitle();
//
//        return expectedTitle.equals(actualTitle);
//    }

    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    /*
    Login method that logs in with specific username
     */
    public void login() {
        emailInput.sendKeys("username");
        passwordInput.sendKeys("password");
        submitButton.click();
    }

    /*
    Login with admin
     */
    public void loginWithAdmin() {
        emailInput.sendKeys("admin");
        passwordInput.sendKeys("password");
        submitButton.click();
    }

    /*
    Login method controlled from configuration.properties
     */
    public void loginWithConfig() {
        emailInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        submitButton.click();
    }

    /*
    This method accepts arguments directly from method
     */
    public void login(String username, String password) {
        emailInput.sendKeys("username");
        passwordInput.sendKeys("password");
        submitButton.click();
    }






    @FindBy(xpath = "//a[@href='#users']")
    public WebElement userLink;

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement dropdown;

    @FindBy(xpath = "//table[@id='tbl_users']//tr")
    public WebElement tableRow;

}
