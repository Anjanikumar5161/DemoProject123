package etvB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2{

	WebDriver driver;
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://vibhotech.vibhohcm.com/");
		
		driver.findElement(By.id("username")).sendKeys("VTIN31");
		driver.findElement(By.id("password")).sendKeys("Anjnani@123");
		driver.findElement(By.className("login-signin")).click();

	}

}
