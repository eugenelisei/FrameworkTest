package com.internship;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    static WebDriver driver = new ChromeDriver();
    static JavascriptExecutor js = (JavascriptExecutor) driver;

    public static void goTo(String url) {
        driver.get(url);
    }
    public static String title() {
        return driver.getTitle();
    }
    public static void close() {
        driver.close();
    }
}
