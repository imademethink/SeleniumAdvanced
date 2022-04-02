import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium04PopUp {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");




        // simple html pop up- accept
        driver.get("http://files.form.guide/contact-form/simple-popup-form-1/a-page.php");
        Thread.sleep(7000);
        driver.findElement(By.cssSelector("img[src='contact-us-button.png']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("First name");
        driver.findElement(By.id("email")).sendKeys("email@email.com");
        Thread.sleep(8000);



//        driver.quit();
    }

}
