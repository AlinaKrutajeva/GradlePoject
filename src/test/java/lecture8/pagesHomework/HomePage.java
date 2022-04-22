package lecture8.pagesHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage extends BasePage {

    public void openLoginPage() {
        driver.findElement(By.xpath("//a[@class='btn btn-login btn-default']")).click();
    }

    public void loginToForumCinemas() {
        driver.findElement(By.xpath("//a[@class='btn btn-login btn-default']")).click();
        driver.findElement(By.id("input-userName")).sendKeys("workjob@inbox.lv");
        driver.findElement(By.id("input-password")).sendKeys("Homework10");
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
    }

    public void openProfilePage() {
        driver.findElement(By.xpath("//a[@class='btn btn-user btn-default']")).click();
        driver.findElement(By.xpath("//a[@class='margin-bottom-quarter inline-block']")).click();
        ((JavascriptExecutor) driver).executeScript("scroll(0,580)");
    }
}
