import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3selQ2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
		  
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("ms.soundar09@gmail.com");
		 
		WebElement passwrd = driver.findElement(By.xpath("//input[@id='pass']"));
		passwrd.sendKeys("9965105007");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		login.click();
		
		
		

}
}