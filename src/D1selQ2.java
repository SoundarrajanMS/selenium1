import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class D1selQ2
{
	public static void main(String[] args) {
		System.getProperty("webdriver.ie.driver","C:\\Users\\rukku\\eclipse-workspace\\Sounder\\Selenium\\Drivers\\IEDriverServer.exe");
		
	// to create an object
	WebDriver z = new InternetExplorerDriver();
		
		//to launch a web browser
		z.get("https://www.facebook.com/");
		
		// to print the title web browser
		String a2 =z.getTitle();
		System.out.println(a2);
		
		// to print the url
		String a3=z.getCurrentUrl();
		System.out.println(a3);
		  
		z.quit();
	
	
	}

}
