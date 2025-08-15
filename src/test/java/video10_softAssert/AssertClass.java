package video10_softAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AssertClass {

    WebDriver driver;

    @Test
    public void testAssert() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("http://automationexercise.com");

        String expectectedUrl = "https://automationexercise.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectectedUrl);

        driver.findElement(By.xpath("//*[text()=' Products']")).click();

        WebElement allProductYaziElementi = driver.findElement(By.xpath("//*[text()='All Products']"));
        Assert.assertTrue(allProductYaziElementi.isDisplayed());

        List<WebElement> productList = driver.findElements(By.xpath("//*[text()='View Product']"));
        Assert.assertTrue(productList.size()>0);

        driver.findElement(By.xpath("(//*[text()='View Product'])[1]")).click();

        WebElement productName = driver.findElement(By.xpath("(//h2)[3]"));
        Assert.assertTrue(productName.isDisplayed());

        WebElement categoryElement = driver.findElement(By.xpath("//*[text()='Category: Women > Tops']"));
        Assert.assertTrue(categoryElement.isDisplayed());
        driver.close();
    }
}
