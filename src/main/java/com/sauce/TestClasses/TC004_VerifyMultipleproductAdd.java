package com.sauce.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.POM.classes.HomePageClass;
import com.sauce.POM.classes.LoginPagePOMClass;

public class TC004_VerifyMultipleproductAdd extends TestBaseClass
{

	
	@Test
	public void mutipleProductAddToCartFunctionality()
	{

	

	
    
    //homePage
    HomePageClass hp = new HomePageClass(driver);
    hp.clickAllProduct();
    
    String actualCount = hp.getTextFromCartButton();
	String expectedCount = "6";
	
	if(expectedCount.equals(actualCount))
	{
		System.out.println("Tc is passed");
	}
	else
	{
		System.out.println("TC is failed");
	}
	
//	driver.quit();
	
	//assignment
//	for loop -->single products
//  mutliple product--> for each loop
	
	
	
	
	
	
}
}
