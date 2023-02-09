package revision;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Queen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\New\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		
		TakesScreenshot scr=(TakesScreenshot)driver;
		
		File source=scr.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\1\\Desktop\\New.jpg");
		
		FileHandler.copy(source, destination);
		
		
		
		
		
	
	

	}

}
