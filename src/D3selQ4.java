import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3selQ4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement fstnme = driver.findElement(By.xpath("//input[@name='firstname']"));
		fstnme.sendKeys("kamal");
		
		WebElement lstnme = driver.findElement(By.xpath("//input[@id='lastname']"));
		lstnme.sendKeys("raj");
		
		WebElement btn = driver.findElement(By.xpath("//input[@name='sex']"));
		btn.click();
		
       //Thread.sleep(2000);
		//WebElement btn2 = driver.findElement(By.xpath("//input[@id='exp-2']"));
		//btn2.click();	
		
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("11.10.2019");
		
		WebElement manual = driver.findElement(By.xpath("//input[@id='profession-0']"));
		manual.click();
		
		WebElement dwnlod = driver.findElement(By.xpath("//a[@href='http://toolsqa.com/wp-content/uploads/2016/09/Test-File-to-Download.xlsx']"));
	   dwnlod.click();
	
	
	}

}
