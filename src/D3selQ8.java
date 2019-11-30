import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3selQ8 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologies.in/selenium-training.php");
	WebElement core = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/download-links.pdf']"));

 core.click();




}
}
