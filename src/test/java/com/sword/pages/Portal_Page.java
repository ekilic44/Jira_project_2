package com.sword.pages;

import com.sword.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Portal_Page {
    public Portal_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "user-name")
    public WebElement profileDropdown;

    @FindBy(xpath = "(//span[@class=\"menu-popup-item-text\"])[5]")
    public WebElement logout;
}
