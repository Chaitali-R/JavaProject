package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Unselectcheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(300);
		//How to Unselect checkboxes if some of checkboxes is already selected ..whichever checkbox
		//selected only that one have to  unselect
		List <WebElement> lists=driver.findElements(By.xpath( "//input[@class='form-check-input' and @type='checkbox' ]"));
        
         //first select some checkboxes eg. here select first 3 checkboxes
		for (int i=0;i<3;i++) {
			lists.get(i).click();
		}
		Thread.sleep(5000);
		
		//the again unselect the checkboxes by clicking again on it.
		for (WebElement list:lists) {
			if(list.isSelected()) {
				list.click();
				
			}
		}
				
	}

}
