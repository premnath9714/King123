package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sinh {
	
	

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\New\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
	WebElement user=driver.findElement(By.xpath("//input[@name='email']"));
	
	user.sendKeys("8381067443");
	
	WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
	
	pass.sendKeys("King");
	
 //  WebElement login=driver.findElement(By.xpath("//button[text()='Log In']"));
   
  // login.click();
   
  // driver.navigate().to("https://www.amazon.in/");
	
	String url=driver.getCurrentUrl();
	
	System.out.println(url);
	
	String title=driver.getTitle();
	
	System.out.println(title);
	
	Dimension d=new Dimension(200,500);
	
	driver.manage().window().setSize(d);
	
	Point p=new Point (500,600);
	
	driver.manage().window().setPosition(p);
	
	driver.close();
	
	
   
	
		
		



}
}