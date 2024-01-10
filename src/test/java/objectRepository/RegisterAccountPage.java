package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAccountPage {
	WebDriver driver;
	public RegisterAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By firstName=By.xpath("//input[@name=\"firstname\"]");
	private By lastName=By.xpath("//input[@name=\"lastname\"]");
	private By email=By.xpath("//input[@name=\"email\"]");
	private By telephone=By.xpath("//input[@name=\"telephone\"]");
	private By password=By.xpath("//input[@name=\"password\"]");
	private By confirmpassword=By.xpath("//input[@name=\"confirm\"]");
	private By privacyPolicy=By.xpath("//input[@name=\"agree\"]");
	private By continueButton=By.xpath("//input[@value=\"Continue\"]");
	
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
	public WebElement lastName() {
		return driver.findElement(lastName);
	}
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement telephone() {
		return driver.findElement(telephone);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement confirmpassword() {
		return driver.findElement(confirmpassword);
	}
	public WebElement privacyPolicy() {
		return driver.findElement(privacyPolicy);
	}
	public WebElement continueButton() {
		return driver.findElement(continueButton);
	}
}
