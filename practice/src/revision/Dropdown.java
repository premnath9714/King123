package revision;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\New\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement create=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		create.click();
		
		Thread.sleep(5000);
		
		WebElement day=driver.findElement(By.xpath("//select[contains(@name,'birthday')][1]"));
		
		Select s=new Select(day);
		
		s.selectByIndex(1);
		
		Thread.sleep(5000);
		
		TakesScreenshot scr=(TakesScreenshot)driver;
		
		File source=scr.getScreenshotAs(OutputType.FILE);
		
	  //  Date d=new Date();
	    
	  //   SimpleDateFormat sdf=new SimpleDateFormat("ddMMYYYY_HHmmss");
	    
	  //  String timeStamp=sdf.format(d);
	   
	    File destination=new File("C:\\Users\\1\\Desktop\\New.jpg");
	    
	    FileHandler.copy(source, destination);

		
		
		
		
		
		
		
		
		

	}

}
