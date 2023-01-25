package booking_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class search_booking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.booking.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/header[1]/nav[1]/div[2]/div[6]/a[1]")).click();
		driver.findElement(By.name("username")).sendKeys("mr.saeed.abed2000@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Saeedsaeed123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement ss = driver.findElement(By.id("DqLWfNYmwxgcjoU"));
		act.clickAndHold(ss).click().perform();


		
		
		
		driver.findElement(By.name("ss")).sendKeys("Amman");
		driver.findElement(By.xpath("//button[@class='fc63351294 a822bdf511 d4b6b7a9e7 cfb238afa1 af18dbd5a4 f4605622ad aa11d0d5cd']")).click();
		

	}

}
