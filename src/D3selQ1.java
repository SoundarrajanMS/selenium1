import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3selQ1
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	WebElement btn = driver.findElement(By.xpath("//a[@href='contact.php']"));
	btn.click();
	
	WebElement iptnme = driver.findElement(By.id("InputName"));
    iptnme.sendKeys("soundar");
    
    WebElement ipteml = driver.findElement(By.id("InputEmail1"));
    ipteml.sendKeys("ms.soundar09@gmail.com");
    
    WebElement iptmob = driver.findElement(By.id("InputSubject"));
    iptmob.sendKeys("9965105007");
    
    WebElement iptcrse = driver.findElement(By.name("courses"));
    
    iptcrse.sendKeys("selenium");
    
    WebElement iptbrnh = driver.findElement(By.name("branch"));
    iptbrnh.sendKeys("OMR");
    
    WebElement time = driver.findElement(By.name("time"));
    time.sendKeys("immediately");
    
    
    
    
    
    
}
}
