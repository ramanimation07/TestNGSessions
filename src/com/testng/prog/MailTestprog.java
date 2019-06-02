package com.testng.prog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MailTestprog {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test(priority = 2,groups = "Title")
	
	public void title()
	{
		String str=driver.getTitle();
		System.out.println(str);
	}
	
	@Test(priority = 1,groups = "Login",dependsOnMethods = "title")
	
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("ram@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Automation");
		Thread.sleep(3000);
	}
	
	@Test(priority = 3,groups = "SignIn",dependsOnMethods = "title")
	
	public void signin()
	{
		driver.findElement(By.name("proceed")).click();
	}
	
	@AfterMethod
	
	public void close()
	{
		driver.quit();;
	}
	
	

}
