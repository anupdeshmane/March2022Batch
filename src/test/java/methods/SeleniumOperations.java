package methods;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("deprecation")
public class SeleniumOperations 
{

	public static WebDriver driver=null;
	
	public static void bLaunch(Object[]inputParameters)
	{
		String browserName= (String) inputParameters[0];
		String exe= (String) inputParameters[1];
		
			if(browserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", exe);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(browserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", exe);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				
			}
	
					
	}
	
	public static void openApp(Object[]inputParameters)		
	{
		try
		{
		String url=(String)inputParameters[0];
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void ClickOnCancle(Object[]inputParameters)		
	{
	try
	
	{
		String xpath=(String)inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

	public static void MoveToLogin(Object[]inputParameters)		
	{
		try {
		Actions action=new Actions(driver);
		String xpath=(String)inputParameters[0];
		WebElement abc = driver.findElement(By.xpath(xpath));
		action.moveToElement(abc).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	public static void ClickOnProfile(Object[]inputParameters)		
	{
		try {
		
		String xpath=(String)inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void EntUserName(Object[]inputParameters)		
	{
		try {
			String xpath=(String)inputParameters[0];
			driver.findElement(By.xpath(xpath)).sendKeys("anup.deshmane@gmail.com");	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
			
		}
	public static void EntPass(Object[]inputParameters)		
	{
		try
		{
		String xpath=(String)inputParameters[0];
		driver.findElement(By.xpath(xpath)).sendKeys("9766072684");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void Login1(Object[]inputParameters)		
		{
		try
		{
			
			String xpath=(String)inputParameters[0];
			driver.findElement(By.xpath(xpath)).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		}
	public static void ValidLogin(Object[]inputParameters)
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String givenText=(String)inputParameters[0];
		String xpath=(String)inputParameters[1];
		
		String actualText=driver.findElement(By.xpath(xpath)).getText();
	
		if (givenText.equalsIgnoreCase(actualText))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test FAil");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		}
		

	public static void main (String[]args) throws Throwable 
	{
		//open browser
		Object[] input=new Object[2];
		input[0]="Chrome";
		input[1]="D:\\NewFlipkartProject2022\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.bLaunch(input);
		//open application
		Object[] input1=new Object[1];
		input1[0]="https://www.flipkart.com";
		SeleniumOperations.openApp(input1);
		//click on cancel button
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.ClickOnCancle(input2);
		//move to login element
		Object[] input3=new Object[1];
		input3[0]="//*[@class=\"_1psGvi _3BvnxG\"]";
		SeleniumOperations.MoveToLogin(input3);
		//Click on my profile
		Object[] input4=new Object[1];
		input4[0]="(//div[@class='_3vhnxf'])[1]";
		SeleniumOperations.ClickOnProfile(input4);
		
	
		//Enter user name
		Object[] input5=new Object[1];
		input5[0]="//*[@class=\"_2IX_2- VJZDxU\"]";
		SeleniumOperations.EntUserName(input5);
		//Enter password	
		Object[] input6=new Object[1];
		input6[0]="//*[@class=\"_2IX_2- _3mctLh VJZDxU\"]";
		SeleniumOperations.EntPass(input6);
		//click login
		Object[] input7=new Object[1];
		input7[0]="//*[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]";
		SeleniumOperations.Login1(input7);
		//open application
		Thread.sleep(3000);
		Object[] input8=new Object[2];
		input8[0]="AnupAnup DeshmaneDeshm";
		input8[1]="//*[@class='_1ruvv2']";
	}
	

}