package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	//By login=By.xpath("//nav[@class='pull-right']/ul/li[4]/a");
	

	//Constructor
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
		
	}
	
	
	
	

}
