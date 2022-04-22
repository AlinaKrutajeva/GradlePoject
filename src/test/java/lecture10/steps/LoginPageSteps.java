package lecture10.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lecture8.pagesHomework.HomePage;


public class LoginPageSteps {

        HomePage homePage = new HomePage();

        @And("Open login page")
        public void openLoginPage() {
                homePage.openLoginPage();
        }

        @And("^Enter user email (.*) and password (.*)$")
        public void enterUserEmailAndPassword(String email, String password) {
                homePage.loginToForumCinemas();
        }

        @When("Click login button")
        public void clickLoginButton() {
                homePage.clickLoginButton();
        }
}
