package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		
		//there are two ways to set the Chromedriver in class file. 
		//The first way is using the path below, it will especify where the system can found the chromedriver localy. It doesn't need to download the file throught the web.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matheus\\chromedriver\\chromedriver.exe");
		
		//The second way is using selenium engine throught webdriver package. It will go in the web and download automatically. Anyway this line in necessary.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		//why use close or quit? when we use close, it will close only the tab opened by chrome driver, if more tabs were opened it will only close using quit
		//driver.close();
		//driver.quit();
	}

}
