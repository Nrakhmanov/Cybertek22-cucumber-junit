package com.cybertek;

import com.cybertek.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Population {



    @Test
    public void interviewTest() {

        Driver.getDriver().get("https://www.worldometers.info/world-population/");

        //WebElement population = Driver.getDriver().findElement(By.xpath("//div[@class='maincounter-number']"));
        WebElement birth = Driver.getDriver().findElement(By.xpath("//span[@rel='births_today']"));

        for (int i = 1; i<21 ; i++) {
            System.out.println(i + " = " + birth.getText());

        }

    }






}
