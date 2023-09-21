package com.sword.pages;

import com.sword.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Out_Page {
    public Log_Out_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div[.='Authorization']")
    public WebElement afterLogOut;


}
