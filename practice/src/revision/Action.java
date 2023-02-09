package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\New\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement first=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		WebElement second=driver.findElement(By.xpath("//span[text()='Your Orders']"));
		
		Actions act=new Actions (driver);
		
	//	act.moveToElement(first).moveToElement(second).click().build().perform();
		


	}

}
