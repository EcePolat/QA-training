package video10_softAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class SoftAssertClass {

    //softAssert ile tüm kod çalıştıktan sonra hataları toplu alırız.
    WebDriver driver;

    @Test
    public void testSoftAssert() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("http://automationexercise.com");
        SoftAssert softAssert = new SoftAssert();

        String expectectedUrl = "https://automationexercise.com/";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectectedUrl);

        driver.findElement(By.xpath("//*[text()=' Products']")).click();

        WebElement allProductYaziElementi = driver.findElement(By.xpath("//*[text()='All Products']"));
        softAssert.assertTrue(allProductYaziElementi.isDisplayed());

        List<WebElement> productList = driver.findElements(By.xpath("//*[text()='View Product']"));
        softAssert.assertTrue(productList.size()>0);

        driver.findElement(By.xpath("(//*[text()='View Product'])[1]")).click();

        WebElement productName = driver.findElement(By.xpath("(//h2)[3]"));
        softAssert.assertTrue(productName.isDisplayed());

        WebElement categoryElement = driver.findElement(By.xpath("//*[text()='Category: Women > Tops']"));
        softAssert.assertTrue(categoryElement.isDisplayed());
        softAssert.assertAll();
        driver.close();
    }
}
