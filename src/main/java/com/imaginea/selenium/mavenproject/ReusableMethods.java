package com.imaginea.selenium.mavenproject;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Hello world!
 *
 */
public class ReusableMethods 
{
    public WebDriver openBrowser(WebDriver driver)
    {
    	try
    	{
    	System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	return driver;
    	}
    	catch(Exception e)
    	{
    		System.out.println("Unable to open browser");
    		System.out.println(e.getMessage());
    		return null;
    	}
    }
    
    
    public void closeBrowser(WebDriver driver)
    {
    	try
    	{
    	if(driver!=null)
    	{
    		driver.quit();
    	}
    	}
    	catch(Exception e)
    	{
    		System.out.println("Closing browser failed");
    		System.out.println(e.getMessage());
    		Assert.fail("Closing browser failed");
    	}
    }
    
    
    public void openUrl(WebDriver driver,String url)
    {
    	try
    	{
    		driver.get(url);
    	}
    	catch(Exception e)
    	{
    		System.out.println("Unable to open Url"+e.getMessage());
    		Assert.fail("Opening "+url+" failed");
    		
    	}
    	
    }
    
    
    /*public WebElement waitForAnElement(WebElement element)
    {
    	try
    	{
    		WebDriverWait wait=new WebDriverWait(driver,30);
    		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    	}
    	catch(NoSuchElementException e)
    	{
    		System.out.println("No Element exists with such xpath "+xpath);
    		Assert.fail("No Such Element exists with xpath "+xpath);
    		return null;
    	}
    	catch(Exception e)
    	{
    		System.out.println("Unable to retrieve element "+description);
    		Assert.fail("Unable to retrieve element "+description);
    		return null;
    	}
    }
    
    
    public void clickOnElement(WebElement element,String xpath,String description)
    {
    	try
    	{
    		waitForAnElement(driver, xpath,description).click();
    		System.out.println("Clicked on "+description);
    	}
    	catch(Exception e)
    	{
    		System.out.println("Failed in clicking "+description);
    		Assert.fail("Failed in clicking "+description);
    	}
    }*/
    
}
