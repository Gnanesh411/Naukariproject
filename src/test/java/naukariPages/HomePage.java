package naukariPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import hooks.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	BaseClass bs = new BaseClass();
	@FindBy(xpath = "//img[contains(@alt,'naukri user profile img')]")
	WebElement profilePic;
	@FindBy(xpath = "//a[text()='View & Update Profile']")
	WebElement viewAndUpdateProfile;
	By upload = By.xpath("//input[@value='Update resume']/../preceding-sibling::div/input[@type='file']");
	//@FindBy(xpath = "//input[@value='Update resume']/../preceding-sibling::div/input[@type='file']")
	//WebElement upload;
	@FindBy(xpath = "//p[contains(text(),'Resume has been successfully uploaded')]")
	WebElement uploadedStatus;
	@FindBy(xpath = "//a[@title='Logout']")
	WebElement logout;

	public void clickOnProfilePic() {
		bs.click(profilePic);
	}

	public void clickOnViewAndUpdateProfile() {
		bs.waitForVisible(viewAndUpdateProfile);
		bs.click(viewAndUpdateProfile);
	}

	public void uploadFile(String filePath) {
		WebElement uploadInput=bs.waitForPresence(upload);
		((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", uploadInput);
		uploadInput.sendKeys(filePath);
	}

	public String verifyUploadSuccessMessage() {
		bs.waitForVisible(uploadedStatus);
		String status = uploadedStatus.getText();
		return status;
	}

	public void logout() {
		clickOnProfilePic();
		bs.click(logout);
	}

}
