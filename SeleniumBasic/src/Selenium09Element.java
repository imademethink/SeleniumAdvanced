import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium09Element {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        Thread.sleep(7000);


        // id
        driver.findElement(By.id("bicycle-checkbox"));
        // name
        driver.findElement(By.name("vehicle1"));
        // class name
        driver.findElement(By.className("input-xlarge"));
        // link text
        driver.findElement(By.linkText("Lakshmi Chandana"));
        // partial link text
        driver.findElement(By.partialLinkText("Lakshmi"));
        // div
        driver.findElement(By.tagName("div"));

        driver.quit();
    }

}
