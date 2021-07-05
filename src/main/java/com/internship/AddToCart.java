package com.internship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AddToCart {

    static String url = "https://www.pearsonassessments.com/";
    static String title = ("Login | US Assessments Site");

    public void goTo() {Browser.goTo(url);}
    public void addProductToCart() throws InterruptedException {

        Browser.driver.manage().window().maximize();
        //Browser.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);

        WebElement cookieButton = Browser.driver.findElement(By.id("cookie-notification-policy-accept-continue"));
        cookieButton.click();

        WebElement loginLink = Browser.driver.findElement(By.className("login-link"));
        loginLink.click();
        //Browser.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(3000);

        WebElement validUsername = Browser.driver.findElement(By.xpath("//*[@id=\"username\"]"));
        validUsername.sendKeys("eugtest5");

        Browser.js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement validPassword = Browser.driver.findElement(By.xpath("//*[@id=\"password\"]"));
        validPassword.sendKeys("Test12test12");

        WebElement signIn = Browser.driver.findElement(By.xpath("//*[@id=\"pearsonLoginForm\"]/div[4]/div/div/button"));
        signIn.click();

        Thread.sleep(3000);

        // WebElement storeIcon = Browser.driver.findElement(By.xpath("//*[@id=\"main-content\"]/header/nav[1]/div/div[2]/div/ul/li[3]/a"));
        // storeIcon.click();

        Thread.sleep(3000);

        WebElement secondProduct = Browser.driver.findElement(By.cssSelector(".product__list--item:nth-child(2) .product__list--name"));
        secondProduct.click();

        Thread.sleep(10000);

        WebElement seePricingOptions = Browser.driver.findElement(By.xpath("//*[@id=\"pricing-tab-btn\"]"));
        seePricingOptions.click();

        Thread.sleep(3000);

        WebElement print = Browser.driver.findElement(By.id("filter--print--1"));
        print.click();

        Thread.sleep(3000);

        WebElement addToCart = Browser.driver.findElement(By.xpath("//*[@id=\"addToCartForm0158009290\"]/fieldset/div[1]/button"));
        addToCart.click();

        Thread.sleep(3000);

        WebElement viewCart = Browser.driver.findElement(By.xpath("//*[@id=\"addToCartLayer\"]/div[3]/a"));
        viewCart.click();

        Thread.sleep(3000);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }

}
