package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement username;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement userLink;

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement dropdown;

    @FindBy(xpath = "//table[@id='tbl_users']//tr")
    public WebElement tableRow;

}
