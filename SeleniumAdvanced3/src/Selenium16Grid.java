import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

// Grid using docker - selenium


/*
dockerized selenium grid on local system

docker run -dit -p 4444:4444 -p 5555:5900 -e maxInstances=5 --name my_grid_local --shm-size=2g selenium/standalone-chrome-debug:3.141.59-selenium

http://localhost:4444/wd/hub             -- to be used in automation code

remote connect to docker using VNC viewer software
    install that software
    start a new connection as       localhost:5555
    password is 'secret'

*/


public class Selenium16Grid {

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
