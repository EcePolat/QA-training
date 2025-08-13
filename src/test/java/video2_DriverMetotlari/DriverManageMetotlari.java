package video2_DriverMetotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMetotlari {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // her testte olması gerekiyor. ^

        // 1- icinde oldugu sayfanin pixel olarak olculerini dondurur.
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getSize().height);

        // 2- icinde oldugu sayfanin pixel olarak konumunu dondurur.
        System.out.println(driver.manage().window().getPosition());

        // 3- icinde oldugu sayfanin sol alt kosesini bizim yapacagimiz pixel noktasina tasir.
        driver.manage().window().setPosition(new Point(15,15));

        // 4- icinde oldugu sayfanin sol alt kosesi sabit olarak bizim yazacagimiz olculere getirir.
        driver.manage().window().setSize(new Dimension(900,600));

        // 5- konumu ve boyutu yeniledikten sonra tekrar yazdirirsak
        System.out.println("yeni pencere olculeri: " + driver.manage().window().getSize());
        System.out.println("yeni pencere konumu: " + driver.manage().window().getPosition());

        // 6- icinde oldugu sayfayi maximize yapar.
        driver.manage().window().maximize();
        System.out.println("maximize konum : " + driver.manage().window().getPosition());
        System.out.println("maximize boyut : " + driver.manage().window().getSize());

        // 7- icinde oldugu sayfayi fullscreen yapar.
        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize());

        // 8- sayfayi simge durumunda kucultur.
        driver.manage().window().minimize();

        //beklenilecek maksimum sureyi belirtir.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
