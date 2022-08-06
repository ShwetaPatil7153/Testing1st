package com.sauce.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sauce.POM.classes.LoginPagePOMClass;
import com.sauce.utility.ScreenshotClass;

public class TestBaseClass
{
	
WebDriver driver;
	
	@BeforeMethod
	public void setUP() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\shweta testing\\Automation\\crome driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
	
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		//screenshot
		ScreenshotClass.takeScreenshot(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//login
		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
	    lp.sendUsername();
	    lp.sendPassword();
	    lp.clickOnLoginButton();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//logOut
		
		driver.quit();
		System.out.println("browser is closed");
	}


}
