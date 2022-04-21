package lecture10.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lecture8.pagesHomework.BasePages;


public class LoginPageSteps {

        BasePages basePage = new BasePages();

        @And("Open login page")
        public void openLoginPage() {
                basePage.openLoginPage();
        }

        @And("Enter user e-mail (.*) and password (.*)")
        public void enterUserEmailAndPassword() {
                basePage.loginToForumCinemas();
        }

        @When("Click login button")
        public void clickLoginButton() {
                basePage.clickLoginButton();
        }
}
