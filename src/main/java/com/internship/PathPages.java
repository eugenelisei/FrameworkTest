package com.internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PathPages {

    static String url = "https://www.pearsonassessments.com/";
    static String title = ("Login | US Assessments Site");

    public void goTo() {
        Browser.goTo(url);
    }
    public void validLogin() {
        Browser.driver.manage().window().maximize();
        Browser.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement loginLink = Browser.driver.findElement(By.className("login-link"));
        loginLink.click();
        //Browser.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement validUsername = Browser.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        validUsername.sendKeys("eugtest5");

        WebElement validPassword = Browser.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        validPassword.sendKeys("Test12test12");
    }

    public boolean isAt() {
        return Browser.title().equals(title);

    }
}
