import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Selenium12WebDriverWait {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
//            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // WebDriver wait - To wait for a certain condition
        WebDriverWait wait = new WebDriverWait(driver, 15);

        driver.findElement(By.cssSelector("a[title='Contact Us']")).click();
        WebElement orderId = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_order")));
        orderId.sendKeys("dummy@dummy.com");

        driver.findElement(By.cssSelector("a[title='Contact Us']")).click();
        wait.until(ExpectedConditions.urlContains("controller=contact"));

        driver.findElement(By.cssSelector("a[title='Contact Us']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("blockbestsellers")));


        driver.quit();
    }

}


