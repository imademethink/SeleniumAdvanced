import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium10Elements {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        Thread.sleep(7000);
        System.out.println("\n\n\n\n\n\n\n\n\n\n");

// Find multiple elements
        // id
        System.out.println("locator : id");
        System.out.println(driver.findElements(By.id("bicycle-checkbox")).size());
        // name
        System.out.println("locator : name");
        System.out.println(driver.findElements(By.name("vehicle1")).size());
        // class name
        System.out.println("locator : className");
        System.out.println(driver.findElements(By.className("input-xlarge")).size());
        // link text
        System.out.println("locator : linkText");
        System.out.println(driver.findElements(By.linkText("Lakshmi Chandana")).size());
        // partial link text
        System.out.println("locator : partialLinkText");
        System.out.println(driver.findElements(By.partialLinkText("Lakshmi")).size());
        // div
        System.out.println("locator : tagName");
        System.out.println(driver.findElements(By.tagName("div")).size());
//        System.out.println(driver.findElements(By.tagName("td")).size());
//        System.out.println(driver.findElements(By.tagName("tr")).size());

        // get individual element
        driver.findElements(By.tagName("div")).get(0);
        driver.findElements(By.tagName("div")).get(1);

        driver.quit();
    }

}
