package video4_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // facebook url adresine git.
        driver.get("https://www.facebook.com");

        // cookies çikarsa kabul et butonuna basin.
        //driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();

        //e posta kutusuna rastgele bir mail girin.
        WebElement eposta = driver.findElement(By.xpath("//input[@id = 'email']"));
        eposta.sendKeys("dgdhshsfhsh");

        //sifre kutusuna rastgele sifre girin.
        WebElement password = driver.findElement(By.xpath("//input[@id = 'pass']"));
        password.sendKeys("fiko");

        // log in yap.
        driver.findElement(By.xpath("//button[@name='login']")).click();

        // mesaj ciktisini test et.
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedSonucYazisi = "Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap.";
        String actualSonucYazisi = sonucYaziElementi.getText();

        if(expectedSonucYazisi.equals(actualSonucYazisi)){
            System.out.println("girilemedi testi passed");
        } else {
            System.out.println("girilemedi testi failed");
        }

        //sayfayi kapat.
        driver.close();
    }
}
