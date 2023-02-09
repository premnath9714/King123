package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\New\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		int count=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total frames available in Webpage="+count);
		
		driver.switchTo().frame("moneyiframe");
		
		String nse=driver.findElement(By.id("nseindex")).getText();
		
		System.out.println(nse);
		
		driver.switchTo().defaultContent();
		
		//a[text()='SPORTS']
		
		driver.findElement(By.xpath("//a[text()='SPORTS']")).click();
		
		
		
		
		
		

	}

}
