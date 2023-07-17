package TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Before_After {
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


}
