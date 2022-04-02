import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;



// Download selenium-server-4.0.0-alpha-7.jar   from
// https://www.selenium.dev/downloads/


public class RelativeLocator {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "D:\\TonyStark\\SeleniumAdvanced4\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        driver.manage().window().maximize();




        driver.get("https://login.wordpress.org/?locale=en_US");
        Thread.sleep(7 * 1000);


        // above a relative element
        WebElement login_email = driver.findElement(withTagName("input").above(By.id("user_pass")));
        login_email.sendKeys("dummy@abc.com");

        driver.findElement(By.id("user_pass")).sendKeys("abcd1234");

        // below a relative element
        WebElement rememberMe = driver.findElement(withTagName("input").below(By.id("user_pass")));
        rememberMe.click();

        // below a relative element
        List<WebElement> submit = driver.findElements(withTagName("input").below(By.id("user_pass")));

        submit.get(1).click();

        Thread.sleep(10 * 1000);



        driver.quit();
    }

}
