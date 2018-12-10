package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private int DEFAULT_TIMEOUT = 25;
	
	String confirm;
	By check;
	String title;
	WebDriver driver;
	WebDriverWait wait;
	

	public BasePage(WebDriver driver) {
	//	title = "Base Page";
		wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
		
	//	check = null;
	//	confirm = null;
		
		this.driver = driver;
	}

}
