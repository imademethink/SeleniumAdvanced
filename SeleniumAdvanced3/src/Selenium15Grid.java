import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

// Grid using docker - local
// Grid using docker - remote system e.g.     http://xxx.xx.xx.xxx:5555/wd/hub

/*

Lets go through documentation
https://www.selenium.dev/documentation/en/grid/grid_4/components_of_a_grid/


Download    selenium-server-standalone-3.9.1.jar     from
http://selenium-release.storage.googleapis.com/index.html?path=3.9/
Download in a special folder
Copy the browser driver exe file in the same folder


Open command prompt
    cd E:\TonyStark\SeleniumAdvanced3\selenium_grid
    java -jar selenium-server-standalone-3.9.1.jar -role hub
Note down the ip address

Check info at --- http://192.168.0.152:4444/grid/console
                  http://localhost:4444/grid/console
                  http://localhost:4444/grid/register

Open another command prompt to register node
    cd E:\TonyStark\SeleniumAdvanced3\selenium_grid
    java -Dwebdriver.chrome.driver="E:\TonyStark\SeleniumAdvanced3\selenium_grid\chromedriver.exe"  -jar selenium-server-standalone-3.9.1.jar -role node -hub http://localhost:4444/grid/register

again Check info at --- http://192.168.0.152:4444/grid/console
                        http://localhost:4444/grid/console


*/


public class Selenium15Grid {

    public static void main(String[] args) throws Exception{

        // Check the host ip address in below node url

//        String nodeURL = "http://192.168.0.152:4444/wd/hub";
        String nodeURL = "http://localhost:4444/wd/hub";

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--privileged");
        chromeOptions.addArguments("window-size=1000,500");
        chromeOptions.addArguments("disable-infobars"); // disabling infobars
        chromeOptions.addArguments("--disable-extensions"); // disabling extensions
        chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model
        WebDriver driver = new RemoteWebDriver(new URL(nodeURL), chromeOptions);


        // simple js alert - accept
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);


        driver.quit();
    }
}
