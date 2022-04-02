import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium14ElementOps {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");


        // send keys, clear, click operation
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        Thread.sleep(5000);
        WebElement emailTextBox = driver.findElement(By.id("email"));
        emailTextBox.sendKeys("abc@dummy.com");






        Thread.sleep(3000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("abc123@dummy.com");
        Thread.sleep(4000);
        driver.findElement(By.id("form_submit")).click();
        Thread.sleep(4000);

        // click on check box
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        Thread.sleep(2000);


        // element state check
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.id("email")).isDisplayed());
        System.out.println(driver.findElement(By.id("email")).isEnabled());
        System.out.println(driver.findElement(By.id("email")).isSelected());


        driver.quit();
    }

}
