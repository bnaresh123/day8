package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class carwale2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("http//carewale.com");
	driver.findElement(By.linkText("Bangalore")).click();
	driver.findElement(By.xpath(".//*[@id='firstLogin']/span[1]")).click();
    driver.findElement(By.linkText(" Register Here")).click();
	
}
}
