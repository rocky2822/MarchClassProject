package org.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitSample {

	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
	}
	@AfterClass
		public static void afterClass() {
		driver.quit();
	}
	@Test
	public void Login() {
WebElement txtusername = driver.findElement(By.id("username"));
txtusername.sendKeys("naveen53");
WebElement txtpswd = driver.findElement(By.id("password"));
txtpswd.sendKeys("C1IZAU");
WebElement btnlogin = driver.findElement(By.name("login"));
btnlogin.click();
	}
	@Before
	
	public void before() {
long start = System.currentTimeMillis();
System.out.println(start);

	}
	@After
	public void after() {
long end = System.currentTimeMillis();

System.out.println(end);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
