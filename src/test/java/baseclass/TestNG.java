package baseclass;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeClass
	private void beforeclass() {
	System.out.println("Browser launch");
	}
	@AfterClass
	private void afterclass() { 
	System.out.println("Close the browser");
	}
	@BeforeMethod
	private void beforemethod() {
	Date d=new Date();
	System.out.println("Start time"+d);
	}
	@AfterMethod
	private void aftermethod() {
	Date d=new Date();
	System.out.println("End time"+d);
	}
	@Test(priority=2)
	private void tc1() {
	System.out.println("tc1");
	}
	@Ignore
	@Test(priority=1)
	private void tc2() {
	System.out.println("tc2");
	}
	@Test(priority=0,enabled=false)
	private void tc3() {
	System.out.println("tc3");
	}
	@Test(priority=-1,invocationCount=2)
	private void tc4() {
	System.out.println("tc4");
	}
	@Test
	private void tc5() {
	System.out.println("tc5");
	System.out.println("success");
}
}	
