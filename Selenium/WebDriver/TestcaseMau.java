package WebDriver;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestcaseMau {
    WebDriver driver;
    WebDriverWait explicitWait;

    @BeforeClass
    public void initialBrower(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        explicitWait = new WebDriverWait(driver,Duration.ofSeconds(15));

    }

    @Test
    public void TC_01_ImLicitWait() {

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
