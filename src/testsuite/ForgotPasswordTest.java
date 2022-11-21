package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilites.Utility;

public class ForgotPasswordTest extends Utility {
    //Url stored into baseUrl
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //Click on forgot password link
        clickOnElement(By.xpath("//p[text()='Forgot your password? ']"));
        //This is from requirement
        String expectedText = "Reset Password";
        String actualText = getTextFromElement(By.xpath("//h6[text()='Reset Password']"));
        //Validate actual and expected message
        Assert.assertEquals(expectedText,actualText);
    }
    @After
    public void tearDown(){
        //This method close the web browser
        closeBrowser();
    }
}
