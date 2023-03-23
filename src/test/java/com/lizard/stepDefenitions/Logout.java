package com.lizard.stepDefenitions;

import com.lizard.pages.LoginPage;
import com.lizard.pages.MainPage;
import com.lizard.utils.ConfigurationReader;
import com.lizard.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {

    LoginPage page_main = new MainPage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
    @When("user in on a main page")
    public void user_in_on_a_main_page() {

        Assert.assertTrue(page_main.getElement(LoginPage.TOPBAR).isDisplayed());
wait.until(ExpectedConditions.urlContains("menu_id"));
    }
    @When("user clicks his username in a top right corner")
    public void user_clicks_his_username_in_a_top_right_corner() {
       page_main.getElement(LoginPage.TOPBAR).click();
    }
    @When("user sees log out button")
    public void user_sees_log_out_button() {
        Assert.assertTrue(((MainPage)page_main).logoutButtonMain.isDisplayed());
    }
    @When("user clicks {string} button")
    public void user_clicks_button(String string) {
        ((MainPage)page_main).logoutButtonMain.click();

    }
    @Then("user on the login page and successful loged out")
    public void user_on_the_login_page_and_successful_loged_out() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
Assert.assertTrue(page_main.getElement(LoginPage.SIGN_IN).getText().equals("Sign in"));
        System.out.println(page_main);
    }

    @When("user hits {string} button")
    public void user_hits_button(String string) {
        Driver.getDriver().navigate().back();


    }
    @Then("user sees {string} message")
    public void user_sees_message(String string) {
      wait.until(ExpectedConditions.visibilityOf(((MainPage)page_main).refreshPageMessage));
      Assert.assertTrue(((MainPage)page_main).refreshPageMessage.isDisplayed());
    }

    @When("user close the browser")
    public void user_close_the_browser() {
Driver.getDriver().get("https://cydeo.com/");
    }
    @When("go on https:\\/\\/qa.upgenix.net\\/ again")
    public void go_on_https_qa_upgenix_net_again() {
        Driver.getDriver().get("https://qa.upgenix.net/web/login");
    }
    @Then("user see can not see him self loged in")
    public void user_see_can_not_see_him_self_loged_in() {

      Assert.assertFalse(page_main.signIn.getText().equals("Sign in"));
    }



}
