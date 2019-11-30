import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2selQ6 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	/*driver.get("https://www.facebook.com/");
	WebElement txtid = driver.findElement(By.id("email"));

	txtid.sendKeys("soundar");
	 
	WebElement txtpassword = driver.findElement(By.id("pass"));
	
	txtpassword.sendKeys("9965105007");
	
	
	driver.get("https://www.redbus.in/");
	
	WebElement fromplace = driver.findElement(By.id("src"));
	 fromplace.sendKeys("chennai");
	 
	 WebElement destplace = driver.findElement(By.id("dest"));
	 destplace.sendKeys("coimbatore");*/
	
	/*driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	WebElement usrid = driver.findElement(By.id("DUMMY1"));
	 usrid.sendKeys("chandru");
	 
	 WebElement phno = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	 phno.sendKeys("1234567");*/
	JavascriptExecutor js = (JavascriptExecutor)driver;

	driver.get("https://www.google.com/");
	WebElement searchtab = driver.findElement(By.name("q"));
//	searchtab.sendKeys("greens technologys");
	
	js.executeScript("arguments[0].setAttribute('value','soundar')", searchtab);

//	Object print = js.executeScript("return arguments[0].getAttribute('value')", searchtab);
//	String s=(String)print;
//	System.out.println(s);

	
	
	/*driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	WebElement usrname = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	Thread.sleep(2000);
	usrname.sendKeys("soundarrajan");
*/}
}
