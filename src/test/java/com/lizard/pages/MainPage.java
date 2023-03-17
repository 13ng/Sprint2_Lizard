package com.lizard.pages;

import com.lizard.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends LoginPage{

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

public static final String LOG_OUT ="log out";
    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutButtonMain;

    public static final String TOPBAR = "topbar";
    @FindBy (xpath = "//span[@class='oe_topbar_name']")
    public WebElement topBar;
}
