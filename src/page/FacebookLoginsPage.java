package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginsPage {

	
	WebDriver driver;
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void afterMethod() {
		
		driver.quit();
	}
	
	public void Logins(String email, String pass) {
		
		driver.findElement(By.id("email")).sendKeys(email);;
		driver.findElement(By.id("pass")).sendKeys(pass);;
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		
	}
	
	public String actual_Err() {
		String actual = driver.findElement(By.className("_9ay7")).getText();
		return actual;
		
	}
	
	
}
