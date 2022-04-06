package lecture7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTask2 {

    @Test
    public void ssLvTest2() {
        String driverPath = "C:\\Users\\a_lin\\IdeaProjects\\MyFirstGradlePoject\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ss.lv/");
        driver.findElement(By.id("mtd_97")).click();
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo("https://www.ss.lv/lv/transport/cars/");
        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
        String minPriceParameter = driver.findElement(By.id("f_o_8_min")).getAttribute("value");
        assertThat(minPriceParameter).isEqualTo("6000");
        String maxPriceParameter = driver.findElement(By.id("f_o_8_max")).getAttribute("value");
        assertThat(maxPriceParameter).isEqualTo("10000");
        Select carYear = new Select(driver.findElement(By.id("f_o_18_min")));
        carYear.selectByValue("2001");
        Select maxCarEngine = new Select(driver.findElement(By.id("f_o_15_max")));
        maxCarEngine.selectByValue("3.0");
        Select carColor = new Select(driver.findElement(By.id("f_o_17")));
        carColor.selectByValue("6318");
        driver.findElement(By.xpath("//input[@class='b s12']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}