package day24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandlingAlertUsingExpliciteWait {
	


		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			Thread.sleep(300);
			driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
			Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());//capture the alert
			myalert.accept();
		

	}

}
