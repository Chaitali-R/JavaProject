package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("truncate")).sendKeys("Admin");
		//WebElement name=driver.findElement(By.name("username"));
		Thread.sleep(0);
		
		
		
		driver.findElement(By.name("search")).sendKeys("Admin");
		boolean statusoflogo=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(statusoflogo);
		//link text and partial link text --only for links. 'a' representing the link and href is attribute which contains link of target page.
		driver.findElement(By.linkText("Tablets")).click();
		//diff bet link text and partial link text--in partial link text we need to write only some portion of text .but we dont prefer partial link text..bcz if it is matching with more than 1 then its confused.
		//so always prefer link text .
		
		List <WebElement> headerlinks =driver.findElements(By.className("overflowable-item"));
		//System.out.println(headerlinks);
		System.out.println(headerlinks.size());
		
		List <WebElement> totallinks =driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		
		List <WebElement> totalimg =driver.findElements(By.tagName("img"));
		System.out.println(totalimg.size());
		//name.sendKeys("Admin");
		//WebElement password=driver.findElement(By.name("password"));
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//password.sendKeys("admin123");
		//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		driver.close();
		
		
	
	}
	

}
