package lecture8;

import lecture8.pagesHomework.BasePages;
import lecture8.pagesHomework.ProfilePagePom;
import org.junit.Test;

public class SeleniumHomework {

    ProfilePagePom profilePagePom = new ProfilePagePom();
    BasePages basePage = new BasePages();

        @Test
        public void forumCinemasTest() {
            basePage.openChromeUrl("https://www.forumcinemas.lv/");
            basePage.loginToForumCinemas();
            basePage.openForumCinemasProfilePage();
            profilePagePom.enterName("Alina");
            profilePagePom.enterSurname("Krutajeva");
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
