package day24;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//1) simple alert with ok button
		//u have to switch driver from particular page to this alert window.and then calling accept method.
		
		driver.switchTo().alert().accept();
		
		//suppose we want to capture the message.the first capture  the alert.(return type is alert.)
		//Alert myalert=driver.switchTo().alert();
		//get text from alert
		//System.out.println(myalert.getText());
		//myalert.accept();
		//String msg=myalert.getText();
		//System.out.println(msg);
		//myalert.accept();
		
		//--------------------------------
    
	//2)Confirmation alert with ok and cancel button.(for OK use accept () and for cancel use Dismiss() method.)
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();	
		driver.switchTo().alert().dismiss();
		
	//3)Prompting alert-
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalertt=driver.switchTo().alert();
		myalertt.sendKeys("hi chaitali");
		Thread.sleep(5000);
		myalertt.accept();
		//myalertt.dismiss();
	}
	
	}
		
	