package com.lizard.pages;

import com.lizard.utils.ConfigurationReader;
import com.lizard.utils.Driver;
import org.junit.Test;

public class test11 {
    @Test
     public void required(){
        LoginPage page = new LoginPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       page.submitButton.click();

        System.out.println(page.login.getAttribute("validationMessage"));


    }






}
