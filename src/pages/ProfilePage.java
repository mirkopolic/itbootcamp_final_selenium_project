package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProfilePage {
	
	private WebDriver driver;
	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
		
	public WebElement getMyProfileLink() {
		return driver.findElement(By.className("btnProfile"));
	}
		
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//a[@href='/login']"));
	}
	
	public WebElement getLogoutButton() {
		return driver.findElement(By.className("btnLogout"));
	}
		
}
