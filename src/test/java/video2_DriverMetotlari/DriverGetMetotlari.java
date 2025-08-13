package video2_DriverMetotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMetotlari {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1- driver.get("url") --> yazdigimiz url'e gider.
        driver.get("https://www.amazon.com");

        // 2- driver.getTitle() --> icinde oldugu sayfanin basligini dondurur.
        System.out.println("sayfa basligi : " + driver.getTitle());

        // 3- driver.getCurrentUrl() --> icinde oldugu sayfanin url'sini dondurur.
        System.out.println(driver.getCurrentUrl());

        // 4- driver.getPageSource(); --> icinde oldugu sayfanin kaynak kodlarini dondurur.
        System.out.println("-----------------------------------");
        System.out.println(driver.getPageSource()); //arka planda calisan sayfa kodlarini yazdirir.
        System.out.println("-----------------------------------");

        // 5- driver.getWindowHandle() --> icinde oldugu sayfanin UNIQUE hash kodunu dondurur.
        System.out.println(driver.getWindowHandle()); // CDwindow-F4A35FD5413FE52C6

        // 6- driver.getWindowHandles() --> driver calisirken acilan tum sayfalarin UNIQUE hash kodunu dondurur.

    }
}
