package com.trycloudproject.tests.User_Story1;

import com.trycloudproject.tests.base.TestBase;
import com.trycloudproject.utilities.TryCloudUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_valid_login_verification extends TestBase {

    //1. Story: As a user, I should be able to login.
    //Test case #1 - verify user login successfully

    //NOTE: Before and After Methods are initialized in TestBase Class, this current Class is extended to that TestBase Class.

    @Test
    public void login_verification_with_validCredentials() throws InterruptedException {
        //2. Enter valid username
        //3. Enter valid password
        //Before entering Username and Password, we need to locate the input box
        //Locating Username input box
        // Enter valid username
        //WebElement userNameInputBox = driver.findElement(By.xpath("//input[@id='user']"));
        //userNameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        //System.out.println(ConfigurationReader.getProperty("username"));
        ////locating Password input box
        // Enter valid password
        //WebElement passwordInputBox = driver.findElement(By.xpath("//input[@id='password']"));
        //passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        //System.out.println(ConfigurationReader.getProperty("password"));
        //Before clicking the Login Button we need to locate that element

        TryCloudUtils.loginPositive(driver);

        //CHECK IF THE LOGIN BUTTON ELEMENT PATH IS THE SAME IN THE NEW ENVIRONMENT
        //4. Click 'login' button

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

        //5. Verify the URL is chawed to homepage's url
        //ATTENTION: URL MUST BE CHANGED DUE TO NEW ENVIRONMENT
        String expectedUrl = "http://qa.trycloud.net/index.php/apps/files/?dir=/&fileid=5783";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(expectedUrl.contains(actualUrl));
    }


}
