package Testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActitimeRunnerscript extends GenericScript {
	@Test
	public void validLogin()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Faceboook" );
		System.out.println("1");
	}
	@Test
	public void validLogin1()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
	}
}



