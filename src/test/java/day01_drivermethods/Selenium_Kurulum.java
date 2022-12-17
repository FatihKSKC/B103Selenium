package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Kurulum {
    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","src/resource/drivers/chromedriver.exe");
/*
En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermemiz
gerekir. Bunun icin java kutuphanesinden system.setProperty() methodunun icine ilk olarak driver'i yazariz.
Ikinci olarak driver;in fiziki yolunu kopyalariz.
 */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com");

    }
}
