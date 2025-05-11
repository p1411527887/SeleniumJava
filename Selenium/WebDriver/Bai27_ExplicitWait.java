package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Bai27_ExplicitWait {
    WebDriver driver;
    WebDriverWait explicitWait;

    @BeforeClass
    public void initialBrower(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        explicitWait = new WebDriverWait(driver,Duration.ofSeconds(30));

    }

    @Test
    public void TC_01_ImLicitWait() throws InterruptedException {
    driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");

    explicitWait.until(ExpectedConditions.visibilityOfElementLocated
            (By.xpath("//div[@class='contentWrapper']")));

    Assert.assertTrue(explicitWait.until(ExpectedConditions.visibilityOfElementLocated
            (By.xpath("//div[@class='contentWrapper']"))).isDisplayed());

    explicitWait.until(ExpectedConditions.elementToBeClickable
            (By.xpath("//td[@title='Tuesday, May 20, 2025']"))).click();

    Assert.assertTrue(explicitWait.until(ExpectedConditions.textToBe
            (By.xpath("//span[@class='label']"),"Tuesday, May 20, 2025")));
    }

    @Test
    public void TC_02_Run_On_Chrome() {

    }

    @Test
    public void TC_03_Run_On_Edge() {

    }

    @AfterClass
    public void cleanBrower(){
        driver.quit();
    }

}
