import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium03JavascriptAlert {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-backgrounding-occluded-windows");


        WebDriver driver = new ChromeDriver(chromeOptions);
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");




        // simple js alert - accept
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);


        // simple js alert - dismiss
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(5000);




        // send keys on alert
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(7000);
        driver.switchTo().alert().sendKeys("Sample123");
        driver.switchTo().alert().accept();
        Thread.sleep(5000);





       // driver.quit();
    }

}
