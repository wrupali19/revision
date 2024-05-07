package revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;  

public class Chromecheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Chrome browser.
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Open URL: www.javatpoint.com
		driver.navigate().to("https://www.javatpoint.com/");
		Thread.sleep(5000);
		
		//Maximize the browser.
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		  //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");  
        
        Thread.sleep(5000);
        
        
        driver.close();
        

		
		
		

	}

}
