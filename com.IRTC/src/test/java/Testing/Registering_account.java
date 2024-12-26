package Testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registering_account {
		WebDriver driver;
			@Test
			
			public void LunchingBrowser() 
			{
				
				WebDriverManager.chromedriver().setup();
				ChromeOptions options= new ChromeOptions();
				options.addArguments("--disable-notifications");
				 driver= new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.irctc.co.in/nget/train-search");
				System.out.println(driver.getTitle());
				
			}
			
			@Test
			public void RegisterButton() throws InterruptedException {
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@aria-label='Click here to register your account with I.R.C.T.C.']")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("userName")).sendKeys("Khayyum66");
				Thread.sleep(4000);
				driver.findElement(By.id("usrPwd")).sendKeys("King@1996");
				Thread.sleep(4000);
				driver.findElement(By.name("cnfUsrPwd")).sendKeys("King@1996");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c65-14']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//li[@aria-label='English']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c65-15']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//li[@aria-label='What is your pet name?']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@formcontrolname='secAns']")).sendKeys("cat");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[@label='Continue']")).click();
				
			}
			
			@Test
			public void Secondarypage() throws InterruptedException {
				
				driver.findElement(By.name("firstName")).sendKeys("Mohammad");
				Thread.sleep(3000);
				driver.findElement(By.id("middleName")).sendKeys("Khayyum");
				Thread.sleep(3000);
				driver.findElement(By.id("lastname")).sendKeys("Baig");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c65-16']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//li[@aria-label='STUDENT']")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("married")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@aria-label='Male']")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("email")).sendKeys("Khayyum664@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.id("mobile")).sendKeys("6302488719");
				Thread.sleep(3000);
				
				// selecting country
				
				WebElement country=driver.findElement(By.xpath("//select[@formcontrolname='nationality']"));
				Select cnty= new Select(country);
				Thread.sleep(3000);
				cnty.selectByValue("94");
				
				// date tab clicking 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Date Of Birth']")).click();
				Thread.sleep(3000);
				
				//selecting year
				
				Select year= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year ng-tns-c58-17 ng-star-inserted']")));
				year.selectByVisibleText("1997");
				
				// selecting month
				Thread.sleep(3000);
				Select month= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month ng-tns-c58-17 ng-star-inserted']")));
				month.selectByVisibleText("June");
				
				//selecting date
				
				String date="14";
				
				List <WebElement> alldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c58-17']//td"));
				for(WebElement ele:alldates) {
					String dt=ele.getText();
					if(dt.equals(date)) {
						ele.click();
						break;			
					}
				}
					driver.findElement(By.xpath("//button[@label='Continue']")).click();
			}
			
			@Test
			public void Thridpage() throws InterruptedException {
				
				driver.findElement(By.id("resAddress1")).sendKeys("1-72/34/");
				Thread.sleep(3000);
				driver.findElement(By.id("resAddress2")).sendKeys("cyberhills colony");
				Thread.sleep(3000);
				driver.findElement(By.id("resAddress3")).sendKeys("Gachibowli");
				Thread.sleep(3000);
				driver.findElement(By.name("resPinCode")).sendKeys("500032");
			/*	Thread.sleep(3000);
				Select city= new Select (driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-invalid ng-touched']")));
				city.selectByVisibleText("RANGA REDDY");
				Thread.sleep(3000);
				Select post= new Select (driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-invalid ng-touched']")));
				post.selectByVisibleText("Manuu S.O");
				Thread.sleep(3000);
				driver.findElement(By.id("resPhone")).sendKeys("6302488719");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']//input[@value='Y']")).click();*/
				
			}
			@Test
			public void YourNextTab() throws InterruptedException
			{
				driver.findElement(By.xpath("//a[@aria-label='Menu BUSES. Website will be opened in new tab']")).click();
				Set<String> ids=driver.getWindowHandles();
				Iterator<String>	it=ids.iterator();
				String parentwindow= it.next();
				String chiledwindow= it.next();
				System.out.println("IDs of:"+parentwindow);
				System.out.println("IDs of:"+chiledwindow);
				driver.switchTo().window(chiledwindow);
				driver.findElement(By.id("departFrom")).sendKeys("Hyderabad");
				//Thread.sleep(7000);
				//driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[1]")).click();
				Thread.sleep(7000);
				driver.findElement(By.id("goingTo")).sendKeys("Karimnager");
				Thread.sleep(7000);
				//driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[1]")).click();
				
				//date tab
				driver.findElement(By.id("departDate")).click();
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				//month
				
				String month="June";
				List <WebElement> mo1= driver.findElements(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']//div//span"));
				for(WebElement m:mo1) {
					String mt=m.getText();
					if(mt.equals(month)) {
						m.click();
						break;			
					}
					
				}
				// selecting date
				String date="14";
				List <WebElement> dates= driver.findElements(By.xpath("//table//tbody//tr//td//a"));
				for(WebElement dat:dates) {
					String mdt=dat.getText();
					if(mdt.equals(date)) {
						dat.click();
						break;			
					}
					
				}
			driver.findElement(By.xpath("//div[@class='form-in-custom3']//button")).click();
			
			}
		}



