package Selenium1.Seleniumfirst1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	public static WebDriver Driver ;
	@BeforeSuite
	public void start() {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
	}
	@AfterSuite
public void close(){
	//Driver.close();
	
}
}
