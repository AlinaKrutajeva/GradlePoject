package lecture8;

import lecture8.pagesHomework.BasePage;
import lecture8.pagesHomework.HomePage;
import lecture8.pagesHomework.ProfilePagePom;
import org.junit.Test;

public class SeleniumHomework {


    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    ProfilePagePom profilePagePom = new ProfilePagePom();


        @Test
        public void forumCinemasTest() {
            basePage.openChromeUrl("https://www.forumcinemas.lv/");
            homePage.openLoginPage();
            homePage.loginToForumCinemas();
            homePage.clickLoginButton();
            homePage.openProfilePage();
            profilePagePom.enterName("Alina");
            profilePagePom.enterSurname("Krutajeva");
            profilePagePom.validateNameAndSurname();
            profilePagePom.selectBirthDay("28");
            profilePagePom.selectBirthMonth("Maijs");
            profilePagePom.selectBirthYear("1994");
            profilePagePom.enterPhoneNumber("+37122074874");
            profilePagePom.enterCity("Ventspils");
            profilePagePom.selectGender();
            profilePagePom.selectLanguage("Krievu");
            profilePagePom.pressApstiprinatButton();
            profilePagePom.validateProfilePageUrl();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            basePage.closeChrome();
        }
    }
