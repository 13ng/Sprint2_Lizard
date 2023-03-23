package com.lizard.pages;

import com.lizard.utils.ConfigurationReader;
import com.lizard.utils.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static final String SIGN_IN = "sign in";
    @FindBy (xpath = "//b[.='Sign in']")
    public WebElement signIn;
////a[@href='#']/b/span[1]
public static final String SIGN_IN_TEXT = "sign in text";
    @FindBy (xpath = "//a[@href='#']/b/span[1]")
    public WebElement signInText;


public static final String TOPBAR = "topbar";
    @FindBy (xpath = "//span[@class='oe_topbar_name']")
    public WebElement topBar;

public static final String ALERT = "alert";
    @FindBy (xpath = "//p[@class='alert alert-danger']")
    public WebElement alert;


    public static final String LOGIN = "login";
    @FindBy (xpath = "//input[@id='login']")
    public WebElement login;

    public static final String PASSWORD = "password";
    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

public static final String SUBMIT_BUTTON = "submit button";
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitButton;

    public static final String ALERT_INPUT = "alert input";
    @FindBy (xpath = "//p[@class='alert alert-danger']")
    public WebElement alertInput;

    public WebElement getElement(String element){

        switch (element) {
            case SIGN_IN : return signIn;
            case LOGIN: return login;
            case PASSWORD: return password;
            case SUBMIT_BUTTON: return submitButton;
            case ALERT_INPUT: return alertInput;
            case TOPBAR: return topBar;
            case ALERT: return alert;
            case SIGN_IN_TEXT: return signInText;
            default: throw new NoSuchElementException("wrong element input");


        }


    }

    public String dynamicLoginSM (String login, int index ){
        switch (login) {
            case "true":
            String correctUser = ConfigurationReader.getProperty("loginSM")+index+ConfigurationReader.getProperty("mail");

return correctUser;
            case "false":
               return "incorrectUsername";

            default: throw new NoSuchElementException("paramiter should be true/false");
        }



    }
    public String dynamicLoginPM (String login, int index ){
        switch (login) {
            case "true":
            String correctUser = ConfigurationReader.getProperty("loginPM")+index+ConfigurationReader.getProperty("mail");

return correctUser;
            case "false":
               return "incorrectUsername";

            default: throw new NoSuchElementException("paramiter should be true/false");
        }



    }
    public String passwordSM (String password){
        switch (password) {
            case "true":
          return   ConfigurationReader.getProperty("passwordSM");


            case "false":
               return "incorrectPassword";

            default: throw new NoSuchElementException("paramiter should be true/false");
        }



    }
    public String passwordPM (String password){
        switch (password) {
            case "true":
          return   ConfigurationReader.getProperty("passwordPM");


            case "false":
               return "incorrectPassword";

            default: throw new NoSuchElementException("paramiter should be true/false");
        }



    }


  //  public WebElement clickButton(String button){







}
