package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSoftAssert {
	@Test
	public void leafTapsLogin() {
		
		//"Leaftaps - TestLeaf Automation Platform"
		String expectedTitle="Leaftaps - TestLeaf Automation Platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver=new ChromeDriver();      // driver - get value as session id
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String actualTitle = driver.getTitle();
		
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("Assertion 1");
		softAssert.assertEquals(actualTitle, expectedTitle);                    
		
		System.out.println("Assertion 2");
		boolean DISPLAYED=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		softAssert.assertAll();

}}
