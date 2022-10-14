package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthRoutesTests extends BasicTest{

	
	@Test(priority=100)
	public void forbidVisitsToHomeUrlIfNotAuthenticated() {
//		Ucitati /home stranu
//		Verifikovati da se u url-u stranice javlja ruta /login
		
		driver.get(baseUrl + "/home");
		
		Assert.assertTrue(
				driver.getCurrentUrl().contains("/login"),
				"ERROR: Url should contain '/login'");
	
	}
	
	@Test(priority=200)
	public void forbidVisitsToProfileUrlIfNotAuthenticated() {
//		Ucitati /profile stranu
//		Verifikovati da se u url-u stranice javlja ruta /login
		
		driver.get(baseUrl + "/profile");
		
		Assert.assertTrue(
				driver.getCurrentUrl().contains("/login"),
				"ERROR: Url should contain '/login'");
	}
	
	@Test(priority=300)
	public void  forbidVisitsToAdminCitiesUrlIfNotAuthenticated() {
//		Ucitati /admin/cities stranu
//		Verifikovati da se u url-u stranice javlja ruta /login
		
		driver.get(baseUrl + "/admin/cities");
		
		Assert.assertTrue(
				driver.getCurrentUrl().contains("/login"),
				"ERROR: Url should contain '/login'");
	}
	
	@Test(priority=400)
	public void  forbidVisitsToAdminUsersUrlIfNotAuthenticated() {
//		Ucitati /admin/users stranu
//		Verifikovati da se u url-u stranice javlja ruta /login
		
		driver.get(baseUrl + "/admin/users");
		
		Assert.assertTrue(
				driver.getCurrentUrl().contains("/login"),
				"ERROR: Url should contain '/login'");
	}
	
}
