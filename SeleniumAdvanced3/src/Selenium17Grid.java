import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

// Grid using docker - zalenium


/*
dockerized selenium grid on local system using zelenium

documentation
    https://opensource.zalando.com/zalenium/
    https://github.com/SeleniumHQ/docker-selenium

docker pull elgalu/selenium
docker pull dosel/zalenium
cd E:\DownloadsNew\zaleiumvideo123
docker run --rm -ti --name my_grid_local_zalenium -p 4444:4444 -v /var/run/docker.sock:/var/run/docker.sock -v /tmp/videos:/E/DownloadsNew/zaleiumvideo1234 --privileged dosel/zalenium start

http://localhost:4444/wd/hub             -- to be used in automation code
http://localhost:4444/grid/console       -- to check how many nodes are registered etc
http://localhost:4444/grid/admin/live    -- live session preview
http://localhost:4444/dashboard          -- archive old video recording, logs etc

*/


public class Selenium17Grid {

    public static void main(String[] args) throws Exception{

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
