package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CitiesPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public CitiesPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public WebElement getNewItemButton () {
		return driver.findElement(By.className("btnNewItem"));
	}
	
	public WebElement getSearchInput () {
		return driver.findElement(By.id("search"));
	}
	
	public void waitForNewEditDialog () {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dlgNewEditItem")));
	}
	
	public WebElement getNewEditDialogInput() {
		return this.driver.findElement(By.name("name"));
	}
	
	public WebElement getSaveNewDialogButton () {
		return driver.findElement(By.className("btnSave"));
	}
			
	public void waitForDeleteDialog () {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Do you really want to delete this item?']/../..")));
	}
		
	public WebElement getDeleteDialogButton () {
		return driver.findElement(By.xpath("//*[text()=' Delete ']/.."));
	}
	
	public void waitForNumbersOfCitiesToBe ( int rows) {
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//table/tbody//tr"), rows));
	}
	
	public WebElement getCellFromRow(int row, int col) {
		return driver.findElement(By.xpath("//table/tbody//tr["+row+"]/td["+col+"]"));
	}
	
	public WebElement getEditButtonFromRow(int row) {
		return driver.findElement(By.xpath("//table/tbody//tr[\" + (row) + \"]//button[@id='edit']"));
	}
	
	public WebElement getDeleteButtonFromRow(int row) {
		return driver.findElement(By.xpath("//table/tbody//tr["+row+"]//*[@id='delete']"));
	}
	

}
