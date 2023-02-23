package apachemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test 
{
@Test
public void Test()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.zomato.com/india");
}
}
