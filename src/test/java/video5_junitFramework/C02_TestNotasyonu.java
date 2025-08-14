package video5_junitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_TestNotasyonu {

    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // site url'sine git.
        driver.get("https://www.amazon.com");

        // arama cubuguna nutella yazdir.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");

        // entere basarak arama islemini yaptirin.
        aramaKutusu.submit();

        // bulunan sonucu yazdir.
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
        System.out.println(sonucYaziElementi.getText());

        driver.close();
    }
}
