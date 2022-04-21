package lecture10.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lecture8.pagesHomework.BasePages;
import lecture8.pagesHomework.ProfilePagePom;

public class HomeAndProfilePageSteps {

    BasePages basePage = new BasePages();
    ProfilePagePom profilePagePom = new ProfilePagePom();

    @Given("Open home page")
    public void openHomePage() {
        basePage.openChromeUrl("https://www.forumcinemas.lv/");
    }

    @And("Open Profile Page")
    public void openProfilePage() {
        basePage.openProfilePage();
    }

    @Then("Validate that name is (.*) and surname is (.*)")
    public void validateNameAndSurname() {
        profilePagePom.validateNameAndSurname();
    }
}
