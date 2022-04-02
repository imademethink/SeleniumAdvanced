import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium05FileUpload {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");




        // file upload
        driver.get("http://the-internet.herokuapp.com/upload");
        Thread.sleep(7000);
        driver.findElement(By.id("file-upload")).sendKeys("E:\\sample.txt");
//        driver.findElement(By.id("file-upload")).sendKeys("E:\\eula.1028.txt");
        Thread.sleep(5000);




//        driver.quit();
    }

}


