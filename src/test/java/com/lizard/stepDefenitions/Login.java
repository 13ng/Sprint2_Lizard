package com.lizard.stepDefenitions;

import com.lizard.pages.LoginPage;
import com.lizard.pages.MainPage;
import com.lizard.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    LoginPage page_login = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
String validationExpected = "Заповніть це поле.";

    @Given("user on login page of upgenix")
    public void user_on_login_page_of_upgenix() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }
    @When("user input correct salesmanager username {int} to username bar")
    public void user_input_correct_salesmanager_username_to_username_bar(Integer index) {
        page_login.getElement(LoginPage.LOGIN).sendKeys(page_login.dynamicLoginSM("true",index));
      Assert.assertTrue(page_login.login.isDisplayed());



    }
    @When("user input correct salesmanager password {string} to password bar")
    public void user_input_correct_salesmanager_password_to_password_bar(String type) {
        page_login.getElement(LoginPage.PASSWORD).sendKeys(page_login.passwordSM(type));
    }
    @When("user clicks Log in button")
    public void user_clicks_log_in_button() {
        page_login.getElement(LoginPage.SUBMIT_BUTTON).click();
    }
    @Then("user successfully loged in")
    public void user_successfully_loged_in() {
wait.until(ExpectedConditions.visibilityOf(page_login.getElement(LoginPage.TOPBAR)));
Assert.assertTrue(page_login.getElement(LoginPage.TOPBAR).isDisplayed());


    }
    @When("user input correct posmanager username {int} to username bar")
    public void user_input_correct_posmanager_username_to_username_bar(Integer index) {
        page_login.getElement(LoginPage.LOGIN).sendKeys(page_login.dynamicLoginPM("true",index));
        Assert.assertTrue(page_login.login.isDisplayed());
    }
    @When("user input correct posmanager password {string} to password bar")
    public void user_input_correct_posmanager_password_to_password_bar(String type) {
        page_login.getElement(LoginPage.PASSWORD).sendKeys(page_login.passwordPM(type));
    }
    @When("user input incorrect password {string} to password bar")
    public void user_input_incorrect_password_to_password_bar(String type) {

            page_login.getElement(LoginPage.PASSWORD).sendKeys(page_login.passwordPM(type));
    }
    @Then("user sees Wrong message")
    public void user_sees_wrong_message() {
       Assert.assertTrue(page_login.alertInput.isDisplayed());
    }
    @When("user input incorrect username {string} to username bar")
    public void user_input_incorrect_username_to_username_bar(String index) {
        page_login.getElement(LoginPage.LOGIN).sendKeys(page_login.dynamicLoginPM(index,0));
        Assert.assertTrue(page_login.login.isDisplayed());
    }
    @When("user input correct password {string} to password bar")
    public void user_input_correct_password_to_password_bar(String type) {
        page_login.getElement(LoginPage.PASSWORD).sendKeys(page_login.passwordPM(type));
    }
    @When("user do not input to username bar")
    public void user_do_not_input_to_username_bar() {
        Assert.assertTrue(page_login.getElement(LoginPage.LOGIN).getText().isEmpty());
    }
    @Then("user sees Please fill out this field message from username input bar")
    public void user_sees_please_fill_out_this_field_message_from_username_input_bar() {
String validationActual = page_login.login.getAttribute("validationMessage");
Assert.assertEquals(validationExpected,validationActual);
    }
    @When("user do not input to password bar")
    public void user_do_not_input_to_password_bar() {
        Assert.assertTrue(page_login.getElement(LoginPage.PASSWORD).getText().isEmpty());
    }
    @Then("user sees Please fill out this field message from password input bar")
    public void user_sees_please_fill_out_this_field_message_from_password_input_bar() {
        String validationActual = page_login.password.getAttribute("validationMessage");
        Assert.assertEquals(validationExpected,validationActual);
    }

    @Then("user sees bullet signes in a password input bar")
    public void user_sees_bullet_signes_in_a_password_input_bar() {
   Assert.assertTrue(page_login.password.getAttribute("type").equals("password"));
    }

    @When("user use ENTER button on a keyboard")
    public void user_use_enter_button_on_a_keyboard() {
        page_login.getElement(LoginPage.PASSWORD).sendKeys(Keys.ENTER);
    }


}
