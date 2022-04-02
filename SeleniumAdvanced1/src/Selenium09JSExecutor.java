import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class Selenium09JSExecutor {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");



        // Scrolling using Javascript
        driver.get("http://the-internet.herokuapp.com/infinite_scroll");
        Thread.sleep(7000);
        JavascriptExecutor jsExec = (JavascriptExecutor)driver;
        // scroll down
        jsExec.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(3000);
        jsExec.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(3000);
        jsExec.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(3000);
        // scroll up
        jsExec.executeScript("window.scrollBy(0,-250)", "");
        Thread.sleep(3000);
        jsExec.executeScript("window.scrollBy(0,-250)", "");
        Thread.sleep(3000);
        jsExec.executeScript("window.scrollBy(0,-250)", "");
        Thread.sleep(3000);


        // Delay using Javascript
        System.out.println(System.currentTimeMillis());
        jsExec.executeAsyncScript("window.setTimeout( arguments[arguments.length - 1], 5000);");
        System.out.println(System.currentTimeMillis());


        driver.get("https://www.facebook.com/privacy/explanation");
        Thread.sleep(7000);
        jsExec.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(7000);



        driver.get("http://the-internet.herokuapp.com/forgot_password");
        Thread.sleep(7000);
        // find element using javascript
        WebElement abc = (WebElement) jsExec.executeScript("return document.getElementById('email');");
        abc.sendKeys("dummy@abcd.com");
        Thread.sleep(7000);
        // click using javascript
        WebElement button = driver.findElement(By.id("form_submit"));
        jsExec.executeScript("arguments[0].click();",button );
        Thread.sleep(7000);




        driver.get("http://the-internet.herokuapp.com/forgot_password");
        Thread.sleep(7000);
        // set value of an element using javascript
        jsExec.executeScript("document.getElementById('email').value='jobs@gmail.com';");
        Thread.sleep(7000);

        driver.quit();
    }

}



