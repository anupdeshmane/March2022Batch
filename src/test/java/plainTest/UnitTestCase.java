package plainTest;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class UnitTestCase
{

	public static void main(String[]args) throws Throwable
	{		
		
		System.setProperty("webdriver.chrome.driver", "D:\\NewFlipkartProject2022\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions action=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@class=\"_1psGvi _3BvnxG\"]"));
		action.moveToElement(element).build().perform();
		
		driver.findElement(By.xpath("//*[@class='_2kxeIr _1pY_1Z']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("anup.deshmane@gmail.com");
		driver.findElement(By.xpath("//*[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("9766072684");
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='oKZoMV']")).click();
		
	
	
	}
	
}
