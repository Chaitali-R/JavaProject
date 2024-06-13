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

public class ScrollbarPage {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1)Scrolling the page till particular pixel
		//js.executeScript("window.scrollBy(0,700)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));//capture how many pixel it is moved.
		
		//2) Scrolling the page till particular element is visible
		
	
		/*
		WebElement element =driver.findElement(By.xpath("//h2[normalize-space()='Resizable']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println(js.executeScript("return window.pageYOffset;"));//155.1999
		
		*/
		//3)  Scrolling the page bottom of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		System.out.println(js.executeScript("return window.pageYOffset;"));

	}

}
