import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02Basic {

    public static void main(String[] args) throws Exception {

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

        driver.get("http://demo.automationtesting.in/Register.html");
                        Thread.sleep(5000);

        driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");
                        Thread.sleep(5000);
        driver.navigate().back();
                        Thread.sleep(5000);
        driver.navigate().forward();
                        Thread.sleep(5000);

        driver.manage().window().maximize();
                        Thread.sleep(5000);
        driver.manage().window().setPosition(new Point(100, 200));
        driver.manage().window().setSize(new Dimension(1100,700));
                        Thread.sleep(5000);
        driver.quit();
    }

}


