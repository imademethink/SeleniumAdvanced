import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium10YoutubeVideo {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumAdvanced1\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");



        // Youtube video playback control

        driver.get("https://www.youtube.com/watch?v=_PNtvXTjVg0");
        Thread.sleep(7000);

        WebElement video = driver.findElement(By.cssSelector("button[class*='ytp-play-button']"));
        video.click();
        Thread.sleep(5000);
        video.click();
        Thread.sleep(4000);
        video.click();
        Thread.sleep(3000);


        driver.quit();
    }

}



