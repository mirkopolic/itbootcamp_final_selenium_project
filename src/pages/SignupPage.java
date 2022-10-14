package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
	
	private WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNameInput() {
		return driver.findElement(By.name("name"));
	}
	
	public WebElement getEmailInput() {
		return driver.findElement(By.name("email"));
	}
	
	public WebElement getPasswordInput() {
		return driver.findElement(By.name("password"));
	}
	
	public WebElement getConfirmPasswordInput() {
		return driver.findElement(By.name("confirmPassword"));
	}
	
	public WebElement getSignMeUpButton() {
		return driver.findElement(By.xpath("//button[@type = 'submit']"));
	}
	
}
