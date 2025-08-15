package video9_testNGFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_DependsOnMethods {

    WebDriver driver;

    @Test
    public void test01() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        Assert.assertTrue(sonucYaziElementi.getText().contains("Nutella"));
    }
    @Test
    public void test04() {
        System.out.println("bak bu calisti.");
    }
}
