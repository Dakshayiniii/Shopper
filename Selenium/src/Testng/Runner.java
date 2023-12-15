package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner extends GenericScript{
	@Test
	public void validlogin()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void logininsta()
	{

		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		
	}
	}
	

