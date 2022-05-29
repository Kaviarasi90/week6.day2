package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	
	@Test
	public void leafTapsLogin() {
		
		//"Leaftaps - TestLeaf Automation Platform"
		String expectedTitle="Leaftaps - TestLeaf Automatio Platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver=new ChromeDriver();      // driver - get value as session id
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		boolean DISPLAYED=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
//		Assert.assertTrue(DISPLAYED);           // title is true, testcase result ll be passed		
		Assert.assertFalse(DISPLAYED);          // value of the title is false,testcase result ll be passed
		                                        //  value of the title is true,testcase result ll be failed
		
		
		
		
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("matched");
//		}
//		else
//		{
//			System.out.println("not matched");
//		}
		

	}

}
