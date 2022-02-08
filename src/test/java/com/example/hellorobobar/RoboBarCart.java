package com.example.hellorobobar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.jetbrains.com/
public class RoboBarCart {
    @FindBy(css = "a.wt-button_mode_primary")
    public WebElement seeAllToolsButton;

    public RoboBarCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
