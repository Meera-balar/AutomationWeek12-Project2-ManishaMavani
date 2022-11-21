package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilites.Utility;

public class LoginTest extends Utility {
    //Url stored into baseUrl
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //enter UserName
        sendTextToElement(By.xpath("//input[@name='username']"),"Admin");
        //enter Password
        sendTextToElement(By.xpath("//input[@name='password']"),"admin123");
        //Click on Login button
        clickOnElement(By.xpath("//button[text()=' Login ']"));
        String expectedMessage = "Dashboard";
        String actualMessage = getTextFromElement(By.xpath("//h6[text()='Dashboard']"));
        //Validate actual and expected message
        Assert.assertEquals("Text match",expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){
        //This method close the web browser
        closeBrowser();
    }
}
