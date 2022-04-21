package lecture8.pagesHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePages {
    public static ChromeDriver driver;
    Dimension dimension = new Dimension(1300, 815);

    public void openChromeUrl(String url){
        String driverPath = "C:\\Users\\a_lin\\IdeaProjects\\MyFirstGradleProject\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().setSize(dimension);
        driver.get(url);
        driver.findElement(By.xpath("//button[@class='btn btn-small']")).click();
    }
    public void openLoginPage(){
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
    public void closeChrome() {
        driver.quit();
    }
}