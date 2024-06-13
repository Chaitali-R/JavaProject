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


public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement dropdownoption=driver.findElement(By.xpath("//select[@id='country']"));
		Select sel=new Select(dropdownoption);
		//sel.selectByIndex(4);
		//sel.selectByValue("france");
		sel.selectByVisibleText("France");	
		 List<WebElement> options=sel.getOptions();
         System.out.println(options.size());
         for(WebElement option : options) {
        	 System.out.println(option.getText());
         }


		
}
	}