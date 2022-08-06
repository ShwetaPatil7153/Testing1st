package com.sauce.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.POM.classes.HomePageClass;
import com.sauce.POM.classes.LoginPagePOMClass;

public class TC003_VerifySingleProductAdd extends TestBaseClass
{
	
	@Test
	public void bagProductAddTOCartFunctionality()
	{

	

	
    //homePage
    HomePageClass hp = new HomePageClass(driver);
    hp.clickOnBagButton();
    
   String actaulCount =  hp.getTextFromCartButton();
    
   String expectedCount = "1";
   
   if(expectedCount.equals(actaulCount))
   {
	   System.out.println("TC is passed");
   }
   else
   {
	   System.out.println("TC is failed");
   }
   
   driver.close();
    
    
	
}


}
