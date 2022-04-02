import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium11ImplicitlyWait {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

        // Implicitly Wait example
        // Global wait and available to all elements
        driver.get("http://automationpractice.com/index.php");

        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("search_query_top"));

        driver.findElement(By.cssSelector("a[title='Log in to your customer account']"));

        driver.findElement(By.cssSelector("a[title='Contact Us']"));

        driver.quit();
    }

}


