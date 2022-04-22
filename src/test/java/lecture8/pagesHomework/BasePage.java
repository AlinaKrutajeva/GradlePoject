package lecture8.pagesHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
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
    public void closeChrome() {
        driver.quit();
    }
}