package qaclickacademy;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	//testNG xml file from Maven
	//how to execute all test cases from Test folder -> mvn test
	//During development, you may run a single test class repeatedly. To run this through Maven, set the test property to a specific test case.
	//mvn -Dtest=TestCircle test
	//To run Smoke, Regression tests as Profiles
	//mvn test -PSmoke
	//mvn test -PRegression
	@Test
	public void BrowserAUtomation()
	{
		System.out.println("BrowserAUtomation");
	}
	@Test
	public void elementsUI()
	{
		System.out.println("elementsUI");
	}
	
	
	
	
	
	
	

}
