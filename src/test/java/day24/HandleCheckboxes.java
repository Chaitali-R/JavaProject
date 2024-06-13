package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;



public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		driver.findElement(By.xpath("//input[@id='thursday']")).click();
		
		
		//clicking all the checkboxes 1 st method
		List <WebElement> lists=driver.findElements(By.xpath( "//input[@class='form-check-input' and @type='checkbox' ]"));
	    for(int i = 0;i<lists.size();i++) {
	    	lists.get(i).click();
	    }
	    
	    /*
	    
	    // second way of clicking the all the checkboxes.
	    for(WebElement list: lists) {
	    	list.click();
	    }
	
	    
	  //select last 3 checkboxes-->total no. of checkboxes - How many checkboxes you want to select= Starting Index
	    //here 7-3=4
	    /*
	    for(int i=4;i<lists.size();i++ ) {
	    	lists.get(i).click();
	    }
	    
	    //select first 3 checkboxes
	   
	     for (int i=0;i<3;i++){
	          lists.get(i).click();

	           }*/
	    
	    
	}
	
	

}
