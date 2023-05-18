package basic1;

import org.testng.annotations.Test;

import baasics.firstprogram;

public class maven  extends firstprogram{
@Test
public void GetTitle() {
	String title=driver.getTitle();
	System.out.println(title);
	}
@Test
public void GetURL() {
	String url= driver.getCurrentUrl();
	System.out.println(url);
	
}
@Test
public void GetWindowHandler() {
	String handle=driver.getWindowHandle();
	System.out.println(handle);
}
}
