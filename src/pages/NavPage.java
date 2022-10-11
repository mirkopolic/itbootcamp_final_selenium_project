package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NavPage {
	
	private WebDriver driver;
	
	public NavPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getHomeLink() {
		return driver.findElement(By.className("btnHome"));
	}
	
	public WebElement getAboutLink() {
		return driver.findElement(By.className("btnAbout"));
	}
	
	public WebElement getMyProfileLink() {
		return driver.findElement(By.className("btnProfile"));
	}
	
	public WebElement getAdminButton() {
		return driver.findElement(By.className("btnAdmin"));
	}
	
	public WebElement getCitiesLink() {
		return driver.findElement(By.className("btnAdminCities"));
	}
	
	public WebElement getUsersLink() {
		return driver.findElement(By.className("btnAdminUsers"));
	}
	
	public WebElement getSignupButton() {
		return driver.findElement(By.xpath("//a[@href='/signup']"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//a[@href='/login']"));
	}
	
	public WebElement getLogoutButton() {
		return driver.findElement(By.className("btnLogout"));
	}
	
	public WebElement getLanguageButton() {
		return driver.findElement(By.className("btnLocaleActivation"));
	}
	
	public WebElement getENLanguageButton() {
		return driver.findElement(By.className("btnEN"));
	}
	
	public WebElement getESLanguageButton() {
		return driver.findElement(By.className("btnES"));
	}
	
	public WebElement getFRLanguageButton() {
		return driver.findElement(By.className("btnFR"));
	}
	
	public WebElement getCNLanguageButton() {
		return driver.findElement(By.className("btnCN"));
	}
	
	public WebElement getHeader() {
		return driver.findElement(By.tagName("h1"));
	}
	
}
