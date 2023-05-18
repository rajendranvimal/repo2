package baasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstprogram {
	public static String URL="https://www.javapoint.com";
	public static WebDriver driver;
	@BeforeTest
 public static void start() {
		//WebDriver driver=new SafariDriver();
	    //WebDriverManager.safaridriver().setup();
	///driver.get("https://www.javapoint.com");
	    driver=new SafariDriver();
	    WebDriverManager.safaridriver().setup();
	    driver.get("https://www.javapoint.com");
}
 @AfterTest
 public static void end() {
	 driver.close();
 }
}
