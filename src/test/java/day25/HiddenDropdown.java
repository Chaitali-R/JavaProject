package day25;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class HiddenDropdown {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		WebElement dropdown=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		dropdown.click();
		
		
		List <WebElement> lists=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(lists.size());
		for (WebElement list : lists) {
			System.out.println(list.getText());
		}
		//System.out.println("list is " + lists.size());
		//for (int i=0;i<lists.size();i++) {
		//	System.out.println(lists.get(i));
		//}
		//Thread.sleep(5000);
		//for(WebElement list : lists) {
			//System.out.println(list.getText());
		//}
		//System.out.println(lists.size());
		//driver.findElement(By.xpath("//span[normalize-space()='Chief Financial Officer']")).click();
		
		driver.quit();
		

	}

}
