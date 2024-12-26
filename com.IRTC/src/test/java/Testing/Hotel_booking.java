package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Hotel_booking extends Registering_account{
	WebDriver driver;
	@Test
	public void zoomhotel() {
		driver.findElement(By.xpath("//a[@aria-label='Menu Hotels. Website will be opened in new tab']")).click();
	}

}
