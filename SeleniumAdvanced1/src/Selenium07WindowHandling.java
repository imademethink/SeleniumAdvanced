import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium07WindowHandling {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");





        // window handling
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site");
        Thread.sleep(7000);

        // store the window handle
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent window handle address : " + parentHandle);

        // open another window
        driver.findElement(By.xpath("//button[text()='Click to open a small window!']")).click();

        Thread.sleep(8000);

        // switch to each window and close
        for( String eachHandle : driver.getWindowHandles() ){
            driver.switchTo().window(eachHandle);
            System.out.println("  Current window address : " + eachHandle);
            System.out.println("  Current window title   : " + driver.getTitle());

            if( ! eachHandle.equals(parentHandle)){
                driver.switchTo().window(eachHandle);
                //driver.findElement(By.xpath("sddfgdfsg"));
                System.out.println("  Current window is not parent window so closing it");
                Thread.sleep(11000);
                //driver.close();
                driver.switchTo().window(parentHandle);
            }
        }



        Thread.sleep(11000);


        System.out.println("  Finally closing parent window");
        driver.quit();
    }

}




