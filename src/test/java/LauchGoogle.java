import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LauchGoogle {
	
	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver (2).exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr309162");
		driver.findElement(By.name("password")).sendKeys("AnEhebY");
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
	}

}
