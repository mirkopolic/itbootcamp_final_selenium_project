package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTests extends BasicTest {

	@Test(priority = 100)
	public void visitTheSignupPage() {
//		Klik na sign up dugme iz navigacije
//		Verifikovati da se u url-u stranice javlja /signup ruta 

		driver.navigate().to(baseUrl);
		navPage.getSignupButton().click();
		
		Assert.assertTrue(driver
				.getCurrentUrl()
				.contains("/signup"), 
				"ERROR: Url should contain '/signup'");
	}
	
	@Test(priority = 200)
	public void checkInputTypes() throws InterruptedException {
//		Klik na sign up dugme iz navigacije
//		Verifikovati da polje za unos emaila za atribut type ima vrednost email
//		Verifikovati da polje za unos lozinke za atribut type ima vrednost password 
//		Verifikovati da polje za unos lozinke za potvrdu za atribut type ima vrednost password


		navPage.getSignupButton().click();
		Thread.sleep(500);
		
		Assert.assertEquals(signupPage
				.getEmailInput()
				.getAttribute("type"), 
				"email",
				"ERROR: Input type should be email!");

		Assert.assertEquals(signupPage
				.getPasswordInput()
				.getAttribute("type"), 
				"password",
				"ERROR: Input type should be password!");
		
		Assert.assertEquals(signupPage
				.getConfirmPasswordInput()
				.getAttribute("type"), 
				"password",
				"ERROR: Input type should be password!");
	}
	
	@Test(priority = 300)
	public void displayErrorsWhenUserAlreadyExists() {
//		name: Another User
//		email: admin@admin.com
//		password: 12345
//		confirm password: 12345
//		 
//		Klik na sign up dugme iz navigacije
//		Verifikovati da se u url-u stranice javlja /signup ruta 
//		Popuniti formu za registraciju podacima
//		Klik na sign up dugme
//		Sacekati da popu za prikaz poruke bude vidljiv
//		Verifikovati da greska sadrzi poruku E-mail already exists
//		Verifikovati da se u url-u stranice javlja /signup ruta 

		
		navPage.getSignupButton().click();
	
		Assert.assertTrue(driver
				.getCurrentUrl()
				.contains("/signup"), 
				"ERROR: Url should contain '/signup'");
	
		signupPage.getNameInput().sendKeys("Another User");
		signupPage.getEmailInput().sendKeys("admin@admin.com");
		signupPage.getPasswordInput().sendKeys("12345");
		signupPage.getConfirmPasswordInput().sendKeys("12345");
		signupPage.getSignMeUpButton().click();
	
		messagePopUpPage.waitForErrorPopUpToBeVisible();
	
		Assert.assertTrue(messagePopUpPage
				.getTextFromErrorPopUpDialog()
				.getText()
				.equals("E-mail already exists"),
				"ERROR: Message should be E-mail already exists");
	}
	
	@Test(priority = 400)
	public void signup() {
//		name: Ime i prezime polaznika
//		email template: ime.prezime@itbootcamp.rs
//		password: 12345
//		confirm password: 12345
//		 
//		Klik na sign up dugme iz navigacije
//		Popuniti formu podacima za registraciju
//		Klik na sign up dugme
//		Ucitati stranicu /home
//		Verifikovati da dijalog za obavestenje sadrzi tekst IMPORTANT: Verify your account
//		Kliknuti na Close dugme iz dijaloga
//		Kliknuti na logout
		
		navPage.getSignupButton().click();
				
		signupPage.getNameInput().sendKeys("Mirko Polic");
		signupPage.getEmailInput().sendKeys("mirko.polic@itbootcamp.rs");
		signupPage.getPasswordInput().sendKeys("12345");
		signupPage.getConfirmPasswordInput().sendKeys("12345");
		signupPage.getSignMeUpButton().click();
	
		Assert.assertTrue(
				messagePopUpPage.getTextFromVerifyAccountPopUpDialog().getText().equals("IMPORTANT: Verify your account"),
				"ERROR: Wrong message.");
		
		messagePopUpPage.getVerifyAccountCloseButton().click();
		navPage.getLogoutButton().click();
	}
	
	
}
