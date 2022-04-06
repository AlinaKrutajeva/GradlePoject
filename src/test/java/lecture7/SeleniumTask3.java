package lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask3 {

    @Test
    public void facebookTest() {
        String driverPath = "C:\\Users\\a_lin\\IdeaProjects\\MyFirstGradlePoject\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy']")).click();
        driver.findElement(By.id("email")).sendKeys("a");
        driver.findElement(By.id("pass")).sendKeys("a9");
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
