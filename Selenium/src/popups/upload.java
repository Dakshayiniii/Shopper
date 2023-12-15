package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class upload
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/upload.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.name("uploadfile"));
		ele.sendKeys("C:\\Users\\HP\\Desktop\\Petstore.postman_collection.json");
}
}