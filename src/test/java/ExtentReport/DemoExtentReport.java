package ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectRepository.LoginPage;

public class DemoExtentReport {
	ExtentReports extent;
	@BeforeSuite
	public void config() {
		String path=System.getProperty("user.dir")+"\\reportE\\index.html";
		//ExtentReport && ExtentSparkReporter
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("QA Test Result");
		 extent =new ExtentReports();
		extent.attachReporter(reporter);		
	}
	
	@Test
	public void showExtentReport() {
		extent.createTest("showExtentReport");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		LoginPage lp=new LoginPage(driver);
		lp.emailField().sendKeys("Prathakumari676@gmail.com");
		lp.passwordField().sendKeys("Pratha676");
		//lp.loginButton().click();
		System.out.println(driver.getTitle());
		extent.flush();
	}
}
