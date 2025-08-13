package video4_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElements03 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // facebook url adresine git.
        driver.get("https://www.bestbuy.com");

        // sayfada kac adet buton bulundugunu yazdirin.
        List<WebElement> buttonListesi = driver.findElements(By.tagName("button"));
        System.out.println(buttonListesi.size());

        // sayfadaki her bir buton uzerindeki yazilari yazdirin.
        for(WebElement each: buttonListesi){
            System.out.println(each.getText());
        }

    }
}
