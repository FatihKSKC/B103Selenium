package day01_drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resource/drivers/chromedriver.exe"); // standart olusturduk
        WebDriver driver = new ChromeDriver();

        // Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com"); // amazona gitti

        // techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com"); // techproeducationa gitti
        Thread.sleep(3000);

        // Tekrar amazon sayfasina donelim
        driver.navigate().back(); // bi onceki sayfaya geri dondu, amazona geri dondu
        Thread.sleep(3000);

        //Tekrar techproeducation sayfasina gidelim
        driver.navigate().forward(); // bir ilerdeki sayfaya gitti, techproeducationa ileri gitti.
        Thread.sleep(3000);

        //Son sayfada sayfayi yenileyelim (refresh)
        driver.navigate().refresh(); // sayfayi yeniledi , techproeducation sayfasini yeniledi.

        //Sayfayi kapatalim
        driver.close();
    }
}
