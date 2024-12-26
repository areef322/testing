package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Asif");
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println(driver.getPageSource());
		Thread.sleep(15000);
		driver.close();
		
				
	}

}
