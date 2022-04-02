import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium06IFrame {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");




        // iframe
        driver.get("http://demo.automationtesting.in/Frames.html");
        Thread.sleep(7000);
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Something Something");
        Thread.sleep(8000);
        driver.switchTo().defaultContent();





//        driver.quit();
    }

}


