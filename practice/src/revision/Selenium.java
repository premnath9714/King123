package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\New\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		
		
		String name=ele.getAttribute("button");
		
		

	}

}
