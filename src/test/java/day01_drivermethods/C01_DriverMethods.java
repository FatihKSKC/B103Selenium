package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resource/drivers/chromedriver.exe"); // standart olusturduk
        WebDriver driver = new ChromeDriver(); // driver isminde bir obje olusturduk. standart
        driver.get("https://www.amazon.com"); // sayfaya gider
        System.out.println("Sayfa Basligi: "+driver.getTitle()); // sayfanin basligini verdi.
        System.out.println(driver.getCurrentUrl()); // https ile baslayan adresini verdi
        //System.out.println(driver.getPageSource());// kaynak kodlari geldi anlamsiz kodlar uzunca bisey.
        System.out.println(driver.getWindowHandle()); // diger pencereye gecmek icin hashcode verdi bize.



    }
}
