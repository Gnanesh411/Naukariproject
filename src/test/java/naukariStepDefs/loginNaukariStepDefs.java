package naukariStepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import naukariPages.BaseClass;
import naukariPages.HomePage;
import naukariPages.loginPageNaukari;

public class loginNaukariStepDefs {

	WebDriver driver = BaseClass.getDriver();
	loginPageNaukari ln = new loginPageNaukari(driver);
	HomePage hp = new HomePage(driver);

	@Given("user clicks on firstLogin button")
	public void user_clicks_on_firstLogin_button() throws InterruptedException {
		ln.clickOnLoginButton1();
	}

	@Given("user enters valid username")
	public void user_enters_valid_username() {
		ln.enterUserName("gnaneswararao.damodara123@gmail.com");
	}

	@Given("user enters valid password")
	public void user_enters_valid_password() {
		ln = new loginPageNaukari(driver);
		ln.enterUserPassword("Gnanesh@411");
	}

	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
		ln.clickOnLoginButton2();
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		String status = ln.verifyHomePage();
		Assert.assertEquals(status, "My home");
	}

	@Given("user clicks on profilepic")
	public void user_clicks_on_profilepic() {
		hp.clickOnProfilePic();
	}

	@And("user clicks on view and update profile")
	public void user_clicks_on_view_and_update_profile() {
		hp.clickOnViewAndUpdateProfile();
	}

	@And("user clicks on update resume button")
	public void user_clicks_on_update_resume_button() {
		hp.uploadFile("C:\\Users\\gnane\\Downloads\\Damodara Gnaneswararao_UpdatedProfile_2025.pdf");
	}

	@Then("upload successfully should be displayed")
	public void upload_successfully_should_be_displayed() {
		hp.verifyUploadSuccessMessage();
	}

	@And("click on logout")
	public void click_on_logout() {
		hp.logout();
	}
}
