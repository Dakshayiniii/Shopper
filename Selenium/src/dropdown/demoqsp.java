package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqsp 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement drop_down1 = driver.findElement(By.xpath("//select[@id='select1']"));
		driver.findElement(By.id("phone")).sendKeys("9345678543");
		
		WebElement drop_down2 = driver.findElement(By.xpath("//select[@id='select2']"));
        Select sel1=new Select(drop_down2);
        sel1.selectByVisibleText("Female");
        Thread.sleep(2000);
        
        WebElement drop_down3 = driver.findElement(By.xpath("//select[@id='select3']"));
        Select sel2=new Select(drop_down3);
        sel2.selectByVisibleText("India");
        Thread.sleep(2000);
        
        WebElement drop_down4 = driver.findElement(By.xpath("//select[@id='select5']"));
        Select sel3=new Select(drop_down4);
        sel3.selectByVisibleText("Karnataka");
        Thread.sleep(2000);
        
        /*WebElement drop_down5 = driver.findElement(By.xpath("//option[contains(text(),'Select City')]"));
        Select sel4=new Select(drop_down5);
        sel4.selectByVisibleText("India");
        Thread.sleep(2000);*/
        driver.findElement(By.xpath("//button[@id='continuebtn']")).click();
        
        //multi select
        driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
        driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
       
        WebElement mul1 = driver.findElement(By.id("phoneInput"));
		driver.findElement(By.xpath("//input[@id='keypoint']")).sendKeys("9345678543");
		
		WebElement mul2 = driver.findElement(By.xpath("//select[@id='select40']"));
        Select s1=new Select(mul2);
        s1.selectByVisibleText("Female");
        s1.selectByVisibleText("Male");
        
        WebElement mul3 = driver.findElement(By.xpath("//select[@id='mul']"));
        Select s2=new Select(mul3);
        s2.selectByVisibleText("India");
        s2.selectByVisibleText("Canada");
        s2.selectByVisibleText("France");
		
        WebElement mul4 = driver.findElement(By.xpath("//select[@id='selectstate']"));
        Select s3=new Select(mul4);
        s3.selectByVisibleText("Karnataka");
        s3.selectByVisibleText("Rajasthan");
        s3.selectByVisibleText("Tamilnadu");
        
        WebElement mul5 = driver.findElement(By.xpath("//select[@id='select40' and @multiple=\"\"]"));
        Select s4=new Select(mul4);
        s4.selectByVisibleText("Mubai");
        s4.selectByVisibleText("Dehli");
        s4.selectByVisibleText("Chennai");
        }
}