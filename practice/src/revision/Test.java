package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\Selenium Folder2022\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
	     Actions act=new Actions(driver);
	     
	  
		
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		  Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).click().build().perform();

	}

}
