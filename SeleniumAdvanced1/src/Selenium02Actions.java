import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium02Actions {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

//        String chromeDriverPath = "E:\\TonyStark\\SeleniumAdvanced1\\browserdriver\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");


        // mouse hover
        driver.get("https://www.ox.ac.uk/about/organisation");
        Thread.sleep(7000);
        Actions a2 = new Actions(driver);

        a2.moveToElement(driver.findElements(By.cssSelector("li[class*='expanded has-children menu-mlid']")).get(0))
          .moveToElement(driver.findElements(By.cssSelector("li[class*='expanded has-children menu-mlid']")).get(1))
          .moveToElement(driver.findElements(By.cssSelector("li[class*='expanded has-children menu-mlid']")).get(2))
                .build()
                .perform();
        Thread.sleep(3000);



        // dragAndDrop
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        Thread.sleep(7000);
        WebElement fromElement = driver.findElement(By.id("draggable"));
        WebElement toElement   = driver.findElement(By.id("droppable"));
        Actions a3 = new Actions(driver);
        a3.dragAndDrop(fromElement, toElement)
                .build()
                .perform();
        Thread.sleep(3000);




        // double click
        driver.get("https://www.ox.ac.uk/about/organisation");
        Thread.sleep(7000);
        Actions a4 = new Actions(driver);
        a4.doubleClick(driver.findElements(By.cssSelector("li[class*='expanded has-children menu-mlid']")).get(0))
                .build()
                .perform();




        // mouse hover
        driver.get("http://the-internet.herokuapp.com/infinite_scroll");
        Thread.sleep(7000);
        Actions a5 = new Actions(driver);
        a4.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
                .build()
                .perform();
        Thread.sleep(3000);

        // sending multiple keys
        a4.keyDown(Keys.CONTROL).sendKeys(Keys.chord("a")).build().perform();
        Thread.sleep(3000);




        // context click
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        Thread.sleep(5000);
        Actions a1 = new Actions(driver);
        a1.contextClick(driver.findElement(By.id("email")))
                .build()
                .perform();
        Thread.sleep(3000);



        driver.quit();
    }

}
