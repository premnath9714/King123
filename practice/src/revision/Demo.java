package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\Selenium Folder2022\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jquery.com/");
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//a[text()='Contribute']
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Contribute']"))).perform();
		
		//a[contains(text(),'jQuery Core ')]
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	//	js.executeScript("window.scrollBy (0,800)");
		
	//	js.executeScript("window.scrollBy (0,-500)");
		
        WebElement ele=	driver.findElement(By.xpath("//a[contains(text(),'jQuery Core ')]"));
        
        js.executeScript("arguments[0].scrollIntoView(true);", ele);
        
        js.executeScript("arguments[0].click();", ele);
        
        

	}

}
