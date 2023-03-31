package tutorialSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup Browser Driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);;
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(5000);
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.manage().timeouts().im
		
		
		driver.close();
		
	}

}
