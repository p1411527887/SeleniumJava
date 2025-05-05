package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Bai26_Wait {
    WebDriver driver;
    WebDriverWait explicitWait;

    @BeforeClass
    public void initialBrower(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        explicitWait = new WebDriverWait(driver,Duration.ofSeconds(15));

    }

    @Test
    public void TC_01_ImLicitWait() {
        driver.get("https://automationfc.github.io/dynamic-loading/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText(),"Hello World!");

    }

    @Test
    public void TC_02_StaticWait() throws InterruptedException {
        driver.get("https://automationfc.github.io/dynamic-loading/");
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        Thread.sleep(10000);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText(),"Hello World!");


    }

    @Test
    public void TC_03_explicitWait() {
        driver.get("https://automationfc.github.io/dynamic-loading/");
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText(),"Hello World!");




    }

    @AfterClass
    public void cleanBrower(){
        driver.quit();
    }

}
