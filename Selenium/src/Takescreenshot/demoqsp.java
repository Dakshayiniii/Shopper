package Takescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoqsp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
       driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
       driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
       driver.findElement(By.xpath("//a[text()='Ratings']")).click();
       
	}

}
