package lecture8.pagesHomework;

import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfilePagePom extends BasePage {
    private final By userName = By.id("inputFirstName");
    private final By userSurname = By.id("inputLastName");
    private final By birthDay = By.id("bdDay");
    private final By birthMonth = By.id("bdMonth");
    private final By birthYear = By.id("bdYear");
    private final By phoneNumber = By.id("inputMobile");
    private final By userCity = By.id("inputCity");
    private final By userGender = By.id("genderFemale");
    private final By userLanguage = By.id("preferredLanguage");
    private final By apstiprinatButton = By.xpath("//button[@class='btn btn-primary']");
    private final String profilePageUrl = "https://www.forumcinemas.lv/mypage/profile/?saved=True";


    public void enterName(String name) {
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys(name);
    }

    public void enterSurname(String surname) {
        driver.findElement(userSurname).clear();
        driver.findElement(userSurname).sendKeys(surname);
    }
    public void validateNameAndSurname() {
        String nameText = driver.findElement(By.id("inputFirstName")).getAttribute("value");
        assertThat(nameText).isEqualTo("Alina");
        String surnameText = driver.findElement(By.id("inputLastName")).getAttribute("value");
        assertThat(surnameText).isEqualTo("Krutajeva");
    }

    public void selectBirthDay(String day) {
        driver.findElement(birthDay).sendKeys(day);
    }

    public void selectBirthMonth(String month) {
        driver.findElement(birthMonth).sendKeys(month);
    }

    public void selectBirthYear(String year) {
        driver.findElement(birthYear).sendKeys(year);
    }

    public void enterPhoneNumber(String number) {
        driver.findElement(phoneNumber).sendKeys(number);
    }

    public void enterCity(String city) {
        driver.findElement(userCity).clear();
        driver.findElement(userCity).sendKeys(city);
    }

    public void selectGender() {
        driver.findElement(userGender).click();
    }

    public void selectLanguage(String language) {
        driver.findElement(userLanguage).sendKeys(language);
    }

    public void pressApstiprinatButton() {
        driver.findElement(apstiprinatButton).click();
    }

    public void validateProfilePageUrl() {
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo(profilePageUrl);
    }
}
