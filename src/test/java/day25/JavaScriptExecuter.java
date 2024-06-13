package day25;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class JavaScriptExecuter {

	public static void main(String[] args)throws InterruptedException {
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//1)sendKeys action
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		//name.sendKeys("Chaitali");
		//driver.quit();
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		JavascriptExecutor js=  driver;
		js.executeScript("arguments[0].setAttribute('value','chaitali')", name);
		//Thread.sleep(2000);
		
		//2)Click() action
		WebElement button_submit = driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']"));
	//	Thread.sleep(5000);
		js.executeScript("arguments[0].click()", button_submit);
		

	}

}
