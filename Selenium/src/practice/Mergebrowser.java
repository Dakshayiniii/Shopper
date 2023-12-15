package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mergebrowser {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		
		String key1="webdriver.gecko.driver";
		String value2="./softwares/geckodriver.exe";
		System.setProperty(key1, value2);
		FirefoxDriver driver1=new FirefoxDriver();
		
	}

}
