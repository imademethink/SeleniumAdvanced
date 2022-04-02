import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

// Secure Sockets Layer (SSL) is a standard security technology for
// establishing an encrypted link between a server and a client

public class Selenium14SslCertificate {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumAdvanced1\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(capability);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://cacert.org/");
        Thread.sleep(7000);


    }

}


