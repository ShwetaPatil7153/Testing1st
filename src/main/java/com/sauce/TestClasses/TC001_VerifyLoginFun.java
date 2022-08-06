package com.sauce.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.POM.classes.LoginPagePOMClass;
import com.sauce.utility.ScreenshotClass;

public class TC001_VerifyLoginFun extends TestBaseClass
{  
	
	@Test
	public void loginFuntionality() throws IOException
	{
      
	    
		//validation
        String expectedTitle = "Swag Labs";	   //given	
		
		String actualTitle = driver.getTitle();  //actual
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("we have successfully logined to saucedmo ");
		    System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		driver.quit();
		System.out.println("broswer is closed");
		
	}



}
