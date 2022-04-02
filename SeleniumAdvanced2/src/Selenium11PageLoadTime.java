import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium11PageLoadTime {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumAdvanced1\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        System.setProperty("webdriver.chrome.silentOutput", "true");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("user-data-dir=" + System.getProperty("user.dir"));
        options.addArguments("start-maximized");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver driver = new ChromeDriver(capabilities);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

        driver.get("http://automationpractice.com/index.php");
        String performanceScript = "var performance = window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {}; var network = performance.getEntries() || {}; return network;";
        String performanceScriptOutput = ((JavascriptExecutor)driver).executeScript(performanceScript).toString();
        // check for duration json key
        System.out.println(performanceScriptOutput);


        // checking in a loop
        for (int k=0; k < 10; k++){
            driver.navigate().to("http://the-internet.herokuapp.com/");
            performanceScriptOutput = ((JavascriptExecutor)driver).executeScript(performanceScript).toString();
            System.out.println(performanceScriptOutput);
            Thread.sleep(4000);
        }


        driver.quit();
    }

}



