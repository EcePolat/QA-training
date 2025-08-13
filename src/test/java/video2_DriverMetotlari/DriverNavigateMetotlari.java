package video2_DriverMetotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMetotlari {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1- driver.get("url") --> istenen url'e gider.
        //    driver.navigate().to("url") --> aynı islem fakat forward ve back yapilmasina imkan tanir.
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        // 2- bir onceki sayfaya donus yapar.
        driver.navigate().back();

        // 3- back ile geldigi sayfaya yeniden gider.
        driver.navigate().forward();

        // 4- icinde oldugu sayfayi yeniler.
        driver.navigate().refresh();

        // driver olusturuldugunda acilan sayfayi kapatmak istersek
        driver.close();

        //driver calisirken birden fazla tab veya window actiysa tumunu kapatmak icin
        driver.quit();
    }
}
