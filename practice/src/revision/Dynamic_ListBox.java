package revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_ListBox {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\New\\chromedriver.exe");
		


		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		String Optioncity="Benin City";
		
		driver.findElement(By.id("fromCity")).sendKeys("BEN");
		
		
	}

}
