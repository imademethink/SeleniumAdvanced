import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium01DropDownSelect {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumAdvanced1\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");


        // dropdown using Select class
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Thread.sleep(5000);
        Select s1 = new Select(       driver.findElement(By.id("dropdown"))       );


        // to get all available option
        for (WebElement eachOption : s1.getOptions()){
            System.out.println(eachOption.getText());
        }


        // select by value
        s1.selectByValue("1");
        Thread.sleep(3000);

        // select by visible text
        s1.selectByVisibleText("Option 2");
        Thread.sleep(3000);

        // select by index
        s1.selectByIndex(1);


//        driver.quit();
    }

}

