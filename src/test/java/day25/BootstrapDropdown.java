package day25;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//common xpath
		/*
		WebElement button=driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']"));
		button.click();
		WebElement btt=driver.findElement(By.xpath("//label[normalize-space()='Java']"));
		btt.click();
		*/
		
		List <WebElement> options=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		for(WebElement op : options) {
			
			String list=op.getText();
			
			System.out.println(op);
			if(list.equals("Java")) {
				op.click();
				
			}
			
		}
	}
}
		
		

	


