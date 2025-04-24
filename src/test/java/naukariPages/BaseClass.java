package naukariPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
	public static WebDriver intializeBrowser() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		return driver;
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public void click(WebElement element) {
		waitForClicking(element).click();
	}

	public void enterValue(WebElement element, String value) {
		waitForVisible(element);
		element.clear();
		element.sendKeys(value);
	}

	 WebElement waitForClicking(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	WebElement waitForVisible(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	WebElement waitForPresence(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
}
