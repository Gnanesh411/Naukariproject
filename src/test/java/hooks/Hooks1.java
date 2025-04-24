package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import naukariPages.BaseClass;

public class Hooks1 {

   static WebDriver driver;
    @BeforeAll
    public static void setUp() {
        driver = BaseClass.intializeBrowser();
        driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
    }
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}