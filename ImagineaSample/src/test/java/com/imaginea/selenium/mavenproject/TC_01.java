package com.imaginea.selenium.mavenproject;

import org.testng.annotations.Test;

import com.imaginea.selenium.pageobjects.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TC_01 extends BusinessVariables
{
  @Test
  public void f() 
  {
	  HomePage homePage=new HomePage(driver);
	  homePage.checkHomePageDisplayed();
  }
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver=reuse.openBrowser(driver);
	  reuse.openUrl(driver, "https://www.imaginea.com/");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  reuse.closeBrowser(driver);
  }

}
