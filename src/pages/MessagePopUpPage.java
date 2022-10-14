package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessagePopUpPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public MessagePopUpPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void waitForErrorPopUpToBeVisible() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error")));
	}
	
	public WebElement getTextFromErrorPopUpDialog() {
		return driver.findElement(By.xpath("//*[contains(@class, 'error')]//ul/li"));
	}
	
	public WebElement getCloseButton() {
		return driver.findElement(By.xpath("//*[contains(text(), 'Close')]/.."));
	}
	public void waitSuccessfullySavedPopUpToBeVisible() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Saved successfully')]")));
	}
	
	public WebElement getTextFromSuccessfullySavedPopUpDialog() {
		return this.driver.findElement(By.xpath("//div[contains(text(), 'Saved successfully')]"));
	}
		
	public void waitVerifyAccountPopUpToBeVisible() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("dlgVerifyAccount")));
	}

	public WebElement getTextFromVerifyAccountPopUpDialog() {
		return driver.findElement(By.className("dlgVerifyAccount"));
	}

	public WebElement getVerifyAccountCloseButton() {
		return driver.findElement(By.className("btnClose"));
	}
		
	
}
