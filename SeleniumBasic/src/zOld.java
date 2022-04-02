import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class zOld {

    public static void main(String[] args) throws Exception {

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);



// System.setProperty("webdriver.chrome.silentOutput", "true");



// https://chromedriver.chromium.org/capabilities
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--privileged");
        chromeOptions.addArguments("window-size=1000,500");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model

//        // to disables the driver to install other chrome extensions
//        chromeOptions.setExperimentalOption("useAutomationExtension", false);




        // Disable image loading - to speedup test execution
        Map<String, Object> pref = new HashMap<String, Object>();
        pref.put("profile.managed_default_content_settings.images", 2);
        chromeOptions.setExperimentalOption("pref", pref);



        WebDriver driver = new ChromeDriver(chromeOptions);

//        driver.get("http://demo.automationtesting.in/Register.html");
        // simple js alert - accept
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);


                    //Thread.sleep(9000);

        driver.quit();
    }
}


/*

with log suppress
==========================
ChromeDriver was started successfully.
Aug 05, 2025 8:50:52 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Process finished with exit code 0



without log suppress
==========================
Starting ChromeDriver xx.xx.xx.xx (398b0743353ff36fb1b82468f63a3a93b4e2e89e-refs/branch-heads/4240@{#378}) on port 20991
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Aug 05, 2025 8:50:50 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2025 8:50:51 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2025 8:50:52 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2025 8:50:53 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2025 8:50:54 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2025 8:50:55 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2025 8:50:56 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2025 8:50:57 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C


 */