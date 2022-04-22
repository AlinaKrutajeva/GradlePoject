package lecture10.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lecture8.pagesHomework.BasePage;
import lecture8.pagesHomework.HomePage;
import lecture8.pagesHomework.ProfilePagePom;

public class HomeAndProfilePageSteps {

    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    ProfilePagePom profilePagePom = new ProfilePagePom();

    @Given("Open home page")
    public void openHomePage() {
        basePage.openChromeUrl("https://www.forumcinemas.lv/");
    }

    @And("Open Profile Page")
    public void openProfilePage() {
        homePage.openProfilePage();
    }

    @Then("^Validate that name is (.*) and surname is (.*)$")
    public void validateNameAndSurname(String name, String surname) {
        profilePagePom.validateNameAndSurname();
    }
}
