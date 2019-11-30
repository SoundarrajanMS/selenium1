import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3selQ6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	
	WebElement arrow = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
	arrow.click();
	
	WebElement signin = driver.findElement(By.xpath("//li[@id='signInLink']"));
	signin.click();
}
}
