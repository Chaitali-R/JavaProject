package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Explicitewait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));//declare the explicite wait
	    //driver.get("https://demo.nopcommerce.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
	  
	}

}
