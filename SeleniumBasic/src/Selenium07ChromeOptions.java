import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Selenium07ChromeOptions {

    public static void main(String[] args) throws Exception {

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");




//        System.setProperty("webdriver.chrome.silentOutput", "true");




        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--privileged");
        chromeOptions.addArguments("window-size=600,500");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model

        // to disables the driver to install other chrome extensions
        chromeOptions.setExperimentalOption("useAutomationExtension", false);

        // Disable image loading - to speedup test execution
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.managed_default_content_settings.images", 2);
        chromeOptions.setExperimentalOption("prefs", prefs);



        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.amazon.com/");

                    Thread.sleep(15000);

        //driver.quit();
    }
}


/*

with log suppress
==========================
ChromeDriver was started successfully.
Aug 05, 2018 8:50:52 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Process finished with exit code 0



without log suppress
==========================
Starting ChromeDriver 86.0.4240.22 (398b0743353ff36fb1b82468f63a3a93b4e2e89e-refs/branch-heads/4240@{#378}) on port 20991
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Aug 05, 2018 8:50:50 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2018 8:50:51 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2018 8:50:52 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2018 8:50:53 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2018 8:50:54 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2018 8:50:55 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2018 8:50:56 PM org.openqa.selenium.remote.ProtocolHandshake createSession
Aug 05, 2018 8:50:57 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C


 */