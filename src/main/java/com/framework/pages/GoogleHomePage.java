package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
    private WebDriver driver;

    private By searchBox = By.name("q");

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearch(String query) {
        driver.findElement(searchBox).sendKeys(query);
    }
}