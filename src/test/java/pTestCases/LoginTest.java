package pTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.LoginPage;

public class LoginTest {
	@Test(priority=1)
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		LoginPage lp=new LoginPage(driver);
		lp.emailField().sendKeys("Prathakumari676@gmail.com");
		lp.passwordField().sendKeys("Pratha676");
		lp.loginButton().click();
		
	}
	
	@Test(priority=2)
	public void loginwithInvalidCredentials() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		LoginPage lp=new LoginPage(driver);
		lp.emailField().sendKeys("Prathakumari676@gmail.com");
		lp.passwordField().sendKeys("Pratha123456");
		lp.loginButton().click();
		
	}
	@Test(priority=3)
	public void loginwithoutCredentials() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		LoginPage lp=new LoginPage(driver);
		lp.emailField().sendKeys("");
		lp.passwordField().sendKeys("");
		lp.loginButton().click();
		
	}
	

}
