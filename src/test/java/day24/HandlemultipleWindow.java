package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlemultipleWindow {


		public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.get("https://demo.nopcommerce.com/");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			Set<String> windowid =driver.getWindowHandles();
			//System.out.println(windowid);
			
			//windowid contains two window id.so how we get this id individually.Ans-1. we can convert into list and then extract.
			
			List <String> listIDs = new ArrayList(windowid);//convert set into list
			//why we need to convert set into list? ans-bcz set collection dont follow index so dont have get()method to extract each string. but list collection has get() method		    
			String parentID=listIDs.get(0);   //get first element
			String childID=listIDs.get(1);    //get last element
			
			//System.out.println(parentID +   "   and   "   + childID );
			//System.out.println("parent"+driver.getTitle());
			//driver.switchTo().window(childID);
			//System.out.println("child"+driver.getTitle());
				
			//switching for multiple windows
			for(String winid : windowid) {
				if(driver.getTitle().equals("OrangeHRM")) {
					System.out.println(driver.getCurrentUrl());
				}
			}
			  
			
			
			
			
	}

}

