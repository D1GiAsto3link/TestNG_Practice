package TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Before_After {
    WebDriver driver;

        @Test
        public void verifySetup()
        {
            System.out.println("TestNG setup is working fine");
        }


@Test
    public void testAnnotation()
    {System.out.println("Thats Gay!");
//Write your test case logic here.
    }

@BeforeTest
    public void browserSetup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //Code to maximize the browser
    }


@BeforeMethod
    public void doLogin()
    {
        System.out.println("On page Swag");
//code to do login
    }

    @AfterMethod
    public void doLogout()
    {
        System.out.println("Quitting page");
//code to do logout
    }


    @AfterTest
    public void compileReport()
    {
        driver.quit();
//code to compile a report
    }
}
