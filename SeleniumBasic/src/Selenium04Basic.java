import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium04Basic {

    public static void main(String[] args) throws Exception {

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");


        driver.get("http://demo.automationtesting.in/Register.html");
                        Thread.sleep(4000);

        driver.close();
//        driver.queit();
    }

}


