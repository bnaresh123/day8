package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class pac2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http//carewale.com");
		driver.findElement(By.linkText("Bangalore")).click();
		//Thread.sleep(5000);

	}
	
	
}
