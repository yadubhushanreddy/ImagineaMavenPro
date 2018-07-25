package com.imaginea.selenium.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//div[@id='logo']")
	public WebElement imagineaLogo;
	
	
	public void checkHomePageDisplayed()
	{
		try
		{
			waitFor(imagineaLogo).isDisplayed();
			System.out.println("Imaginea logo was displayed");
		}
		catch(Exception e)
		{
			System.out.println("Imaginea logo was not displayed");
			System.out.println(e.getMessage());
			Assert.fail("Imaginea logo was not displayed");
		}
	}
	
	public WebElement waitFor(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
