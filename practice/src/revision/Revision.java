package revision;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Revision {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\Selenium Folder2022\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		Dimension d=new Dimension(1000,500);
		
		driver.manage().window().setSize(d);
		
		Point p=new Point(800,600);
		
		driver.manage().window().setPosition(p);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
        String url=driver.getCurrentUrl();
        
        System.out.println(url);
        
        String title= driver.getTitle();
        
        System.out.println(title);
        
        Thread.sleep(5000);
        
    //  driver.navigate().to(url);
        
    //  driver.navigate().forward();
        
    //  driver.navigate().back();
        
    //  driver.navigate().refresh(); 
        
    //    driver.close();
        
        
WebElement email=driver.findElement(By.name("email"));

email.sendKeys("premnath");
		
WebElement pass=driver.findElement(By.id("pass"));
		
pass.sendKeys("kkr");

WebElement create=driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));

create.click();

Thread.sleep(5000);

WebElement radio=driver.findElement(By.xpath("//input[@value='1']"));

boolean result=radio.isSelected();

if(result)
{
	System.out.println("It is Selected By Defalult");
}
else
{
	radio.click();
}

Thread.sleep(5000);

driver.findElement(By.xpath("//input[@value='-1']")).click();

WebElement custom=driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));

boolean b=custom.isDisplayed();

if(b)
{
	System.out.println("It is Selected By Defalult");
}
else
{
	System.out.println("Not Selected By Default");
}

WebElement mno=driver.findElement(By.xpath("//input[@name='reg_email__']"));
String s=mno.getAttribute("name");
//System.out.println(s);
if(s.equals("reg_email__"))
{
	System.out.println("Test Is Passed");
}
else
{
	System.out.println("Test is falied");
}
WebElement signup=driver.findElement(By.xpath("//button[text()='Sign Up']"));

String text=signup.getText();

if(text.equals("Sign Up"))
{
	System.out.println("Test is Passed");
}
else
{
	System.out.println("Test is Failed");
}

    Thread.sleep(5000);
	
	WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
	
	Select sd=new Select(day);
	
	sd.selectByValue("1");
	
	WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
	
	Select ms=new Select(month);
	
	ms.selectByIndex(8);
	
	WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
	
	Select sy=new Select(year);
	
	sy.selectByVisibleText("1997");
	
	TakesScreenshot scr=(TakesScreenshot)driver;
	
    File source=scr.getScreenshotAs(OutputType.FILE);
    
    Date date=new Date();
    
    SimpleDateFormat sdf=new SimpleDateFormat("DDMMYYYY_hhmmss");
    
    String timestamp=sdf.format(date);
    
    File dest=new File("C:\\Users\\1\\Desktop\\Screenshot\\Screenshot"+timestamp+".jpg");
    
    FileHandler.copy(source, dest);
	
	
	}
}
