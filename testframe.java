import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testframe
{
	@Test
	public void testiframe()
	{
		System.setProperty("webdriver.gecko.driver","B:\\Automation\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click();//here we are using xpath
	}
	

}
