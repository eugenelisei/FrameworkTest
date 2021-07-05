package com.internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ValidRegistration {

    static String url = "https://www.pearsonassessments.com/";
    static String title = ("Login | US Assessments Site");

    public void goTo() {
        Browser.goTo(url);
    }
    public void validRegistration() throws InterruptedException {

        Browser.driver.manage().window().maximize();
        WebElement cookieButton = Browser.driver.findElement(By.id("cookie-notification-policy-accept-continue"));
        cookieButton.click();
        Browser.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement loginLink = Browser.driver.findElement(By.className("login-link"));
        loginLink.click();
        Thread.sleep(3000);

        WebElement firstName = Browser.driver.findElement(By.id("firstName"));
        firstName.sendKeys("Eugen");

        WebElement lastName = Browser.driver.findElement(By.id("lastName"));
        lastName.sendKeys("Elisei");

        WebElement email = Browser.driver.findElement(By.id("emailID"));
        email.sendKeys("eugen.elisei@yahoo.com");

        WebElement sameAsUsername = Browser.driver.findElement(By.id("same_as_email_address_registration"));
        sameAsUsername.click();

        WebElement username = Browser.driver.findElement(By.id("userID"));
        username.sendKeys("testuser212");

        Browser.js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement password = Browser.driver.findElement(By.id("passwordID"));
        password.sendKeys("TestPass123");

        Browser.js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement agreeCheckbox = Browser.driver.findElement(By.id("acceptTermsOfUseError"));
        agreeCheckbox.click();

        Browser.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement createAccountButton = Browser.driver.findElement(By.id("pearsonRegistrationForm"));
        createAccountButton.click();

    }
    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
