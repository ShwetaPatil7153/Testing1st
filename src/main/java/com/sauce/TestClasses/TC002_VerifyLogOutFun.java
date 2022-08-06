package com.sauce.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.POM.classes.HomePageClass;
import com.sauce.POM.classes.LoginPagePOMClass;
import com.sauce.utility.ScreenshotClass;

public class TC002_VerifyLogOutFun extends TestBaseClass 
{  
	


    @Test
    public void logOutFunctionality()
    {

		
		//homePage
		//logOutActivity
		
		HomePageClass hp = new HomePageClass(driver);
		hp.clickOnSettingButton();
		System.out.println("Click on SettingButton");
		hp.clickOnLogOutButton();
		System.out.println("Click on LogOutButton");
		
		System.out.println("Applying the validation");
		
		//loginpage
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test Case is passed");
		}
		else
		{
			System.out.println("Test Case is failed");
		}
		
		driver.quit();
		System.out.println("browser is closed");
		
	}

}
