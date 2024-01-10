package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
      public LoginPage(WebDriver driver) {
    	  this.driver=driver;
      }
	
	    private By emailField=By.xpath("//input[@id=\"input-email\"]");
	   private  By passwordField=By.xpath("//input[@id=\"input-password\"]");
	    private By loginButton=By.xpath("//input[@value=\"Login\"]");
	    
	    public WebElement emailField(){
	    	return driver.findElement(emailField);
	    }
	     
	    
	    public WebElement passwordField(){
	    	return driver.findElement(passwordField);
	    }
	    
	    public WebElement loginButton(){
	    	return driver.findElement(loginButton);
	    }

}
