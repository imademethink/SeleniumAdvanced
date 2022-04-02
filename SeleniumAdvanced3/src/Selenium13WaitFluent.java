import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Selenium13WaitFluent {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        driver.manage().window().maximize();

        // Fluent Wait commands are most useful when interacting with web elements
        // that can sometimes take more time than usual to load.
        // This largely occurs in Ajax applications

        // Fluent wait example
        driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/transparency/defaultcs.aspx");

        driver.findElement(By.cssSelector("button[value='Click to see the loading image']")).click();

        FluentWait <WebDriver> wait = new FluentWait<>(driver);
        wait.pollingEvery(Duration.ofSeconds(1))
            .withTimeout(Duration.ofSeconds(15))
            .ignoring(NoSuchElementException.class); // Need to use correct exception to be ignored
//            .ignoring(StaleElementReferenceException.class);

        WebElement imageElement = wait.until
        (
            new Function<WebDriver, WebElement>()
            {
                public WebElement apply(WebDriver driver) {
                    System.out.println("check---");
                    return driver.findElement(By.cssSelector("div[class='background4']"));
                }
            }
        );


        System.out.println(imageElement.getAttribute("style"));


        driver.quit();
    }

}


