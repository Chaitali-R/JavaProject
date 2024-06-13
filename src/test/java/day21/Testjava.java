package day21;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://gethppy.com/productivity/hrms-testing-explained");
		String title=driver.getTitle();
		if(title.equals("my titel")) {
			System.out.println("opassss");
		}
			else
			{
				System.out.println("fail");
			}
		driver.quit();
		}

	}


