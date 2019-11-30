import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3selQ15 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
	 WebElement usrnme = driver.findElement(By.xpath("//input[@id='navbar_username']"));
	 usrnme.sendKeys("soundar");
	WebElement pswd = driver.findElement(By.xpath("//input[@id='navbar_password']"));
	pswd.sendKeys("12345");
}}
	