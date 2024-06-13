package day25;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Frame_iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//frame1
		WebElement iframe1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(iframe1);
		driver.findElement(By.name("mytext1")).sendKeys("chaitali");
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		//driver.switchTo().defaultContent(); --driver came to original page.
		//frame2
		WebElement iframe2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(iframe2);
		driver.findElement(By.name("mytext2")).sendKeys("Ranmale");
		driver.switchTo().parentFrame();
		//frame3--Nested iframe
		
		WebElement iframe3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(iframe3);
		driver.findElement(By.name("mytext3")).sendKeys("rushi");//we r in frame
		//still we r in iframe3.in iframe3 there is another iframe..but only one iframe is present so we use index.
		driver.switchTo().frame(0);//we are in inner iframe...iframe inside iframe
		
		WebElement radiobutton= driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		radiobutton.click();
		//WebElement radiobutton= driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")); --this webelement we find out by right click to link(right click on iframe src "any link which include webelements of inner frame")-->copy link address-->open in another tab-->then find the webelement by inspecting.(bcz selector hub not give)
		driver.switchTo().parentFrame();

		
		
		
		}

}
