import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium13ElementCss {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

        driver.get("https://www.stanford.edu/");
        Thread.sleep(7000);


        // Classic tag and attribute - search box
        driver.findElement(By.cssSelector("button[aria-controls='site-search']"));
        //driver.findElement(By.cssSelector("#email"));

        // tag#id + attribute- search box
        driver.findElement(By.cssSelector("button#search-toggle[data-ga-action='Search toggle']"));

        // tag.classname + attribute- search box
        driver.findElement(By.cssSelector("ul.menu[id='menu-gateway-nav']"));





        // sub string matcher - (^) start with
        driver.findElement(By.cssSelector("li[class^='menu-item']"));

        // sub string matcher - (*) contains
        driver.findElement(By.cssSelector("li[class*='menu-item-object-page']"));

        // flaky        // sub string matcher - ($) ends with
        //driver.findElement(By.cssSelector("li[class$='menu-item']"));


        // parent to child (tag)
//        driver.findElement(By.cssSelector("section[class='theme--choco']>a"));
        driver.findElement(By.cssSelector("section[class='panel']>a[href='https://healthalerts.stanford.edu/covid-19/']"));

        driver.quit();
    }

}


