	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4selQ3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("http://www.greenstechnologies.in/selenium-training.php");
	WebElement para12 = driver.findElement(By.xpath("//p[contains(text(),'Greens Technology, Rated As ')]"));
	String printpara = para12.getText();
	System.out.println(printpara);
	
	
	
	
	//driver.get("http://www.greenstechnologies.in/selenium-training.php");
	WebElement para2 = driver.findElement(By.xpath("(//p[contains(text(),'')])[3]"));
	String print2 = para2.getText();

	 System.out.println(print2);
	
	
	
	
	
	
	
	
	}

}
