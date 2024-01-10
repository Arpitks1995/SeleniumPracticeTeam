package pTestCases;



import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RegisterAccountPage;

public class RegisterAccountTest {
	@Test
	public void registerValidUser() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		RegisterAccountPage rap=new RegisterAccountPage(driver);
		rap.firstName().sendKeys("Kumar");
		rap.lastName().sendKeys("Kunal");
		rap.email().sendKeys(RegisterAccountTest.getTimeStamp());
		rap.telephone().sendKeys("9988776655");
		rap.password().sendKeys("pankaj9282");
		rap.confirmpassword().sendKeys("pankaj9282");
		rap.privacyPolicy().click();
		rap.continueButton().click();
		
		
	}
	@Test
	public void toValidateFieldAremandatoryOrNot() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		RegisterAccountPage rap=new RegisterAccountPage(driver);
		rap.firstName().sendKeys("");
		rap.lastName().sendKeys("Kunal");
		rap.email().sendKeys(RegisterAccountTest.getTimeStamp());
		rap.telephone().sendKeys("9988776655");
		rap.password().sendKeys("pankaj9282");
		rap.confirmpassword().sendKeys("pankaj9282");
		rap.privacyPolicy().click();
		rap.continueButton().click();
		
		
	}
	
	@Test
	public void toValidatePrivacyPolicy() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		RegisterAccountPage rap=new RegisterAccountPage(driver);
		rap.firstName().sendKeys("Raman");
		rap.lastName().sendKeys("Kunal");
		rap.email().sendKeys(RegisterAccountTest.getTimeStamp());
		rap.telephone().sendKeys("9988776655");
		rap.password().sendKeys("pankaj9282");
		rap.confirmpassword().sendKeys("pankaj9282");
		//rap.privacyPolicy().click();
		rap.continueButton().click();
		String actualwarning=driver.findElement(By.xpath("//div[contains(text(),\"Warning: E-Mail Address is already registered!\")]")).getText();
		String warningmessage="Warning: You must agree to the Privacy Policy!";
		//Assert.assert(warningmessage.contains(actualwarning));
		Assert.assertEquals(warningmessage,actualwarning , "Check");
		
		
	}
	
	
	public static String getTimeStamp() {
		Date date=new Date();
		String time=date.toString().replaceAll(" ", "_").replaceAll(":", "_");
		return "arpit"+time+"@gmail.com";
	}
	

}
