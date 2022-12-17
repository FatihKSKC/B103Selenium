package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ClassWork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resource/drivers/chromedriver.exe"); // standart olusturduk
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // bunu her classta yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // bunu her classta yap.




        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("facebook")){
            System.out.println("Title testi PASSED");
        }else
            System.out.println("Test FAILED. Dogru Baslik: "+actualTitle);


        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("facebook")){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED. Dogru url: "+ actualUrl);



        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");


        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWalmerTitle = driver.getTitle();
        if (actualWalmerTitle.contains("Walmart.com")){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Browser’i kapatin
        driver.close();
    }

}
