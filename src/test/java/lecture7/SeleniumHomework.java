package lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHomework {

    @Test
    public void aliexpressTest() {
        String driverPath = "C:\\Users\\a_lin\\IdeaProjects\\MyFirstGradlePoject\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.xpath("//img[@class='btn-close']")).click();
        driver.findElement(By.id("search-key")).sendKeys("tattoo");
        driver.findElement(By.xpath("//input[@class='search-button']")).click();
        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");
        driver.findElement(By.xpath("//a[@href='javascript:void(0);']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}