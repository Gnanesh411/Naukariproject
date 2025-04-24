package naukariPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import hooks.BasePage;

public class loginPageNaukari extends BasePage{
		
	public loginPageNaukari(WebDriver driver){
		super(driver);
	}
	BaseClass bs = new BaseClass();
	
	@FindBy(xpath = "//a[text()='Login']") WebElement login;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter your active Email ID / Username')]") WebElement userName;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter your password')]") WebElement password;
	@FindBy(xpath = "//button[text()='Login']") WebElement loginButton;
	@FindBy(xpath = "//span[contains(text(),'My home')]") WebElement homePage;
	
	public void clickOnLoginButton1() {
		bs.waitForVisible(login);
		login.click();
	}
	public void enterUserName(String user) {
		userName.sendKeys(user);
	}
	public void enterUserPassword(String pswd) {
		password.sendKeys(pswd);
	}
	public void clickOnLoginButton2() {
		loginButton.click();
	}
	public String verifyHomePage() {
		bs.waitForVisible(homePage);
		return homePage.getText();
	}
}
