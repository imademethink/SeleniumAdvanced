import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01Basic {

    public static void main(String[] args) {

        //https://chromedriver.chromium.org/downloads
        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";

        // https://www.selenium.dev/downloads/
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        //driver.quit();
    }

}




/*


Download required Selenium jar/ Java binding
https://www.selenium.dev/downloads/


Download ChromeDriver.exe for windows
https://chromedriver.chromium.org/downloads

Set system property to know from where to refer the browser-driver

 */
