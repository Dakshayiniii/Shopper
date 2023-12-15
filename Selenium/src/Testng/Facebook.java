package Testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook extends GenericScript{
	@Test
	public void validLogin()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(title,"Faceboook" );
		System.out.println("1");
		sa.assertAll();
	}
	@Test
	public void validLogin1()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
	}
}



