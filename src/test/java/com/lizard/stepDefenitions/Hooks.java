package com.lizard.stepDefenitions;

import com.lizard.pages.MainPage;
import com.lizard.utils.ConfigurationReader;
import com.lizard.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {
    @Before(value = "@login")
    public void setupScenarioForLogins() {
  Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }
    @After(value = "@login_s")
        public void setupScenarioForLogout(){
        MainPage page = new MainPage();
page.topBar.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),1);
        wait.until(ExpectedConditions.visibilityOf(page.logoutButtonMain));
        page.logoutButtonMain.click();



    }

}
