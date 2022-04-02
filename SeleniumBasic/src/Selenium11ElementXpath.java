import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium11ElementXpath {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

        driver.get("https://github.com/");
        Thread.sleep(7000);


        // Absolute xpath - search box
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/div/div/form/label/input[1]"));

        // Relative xpath - search box
        driver.findElement(By.xpath("//header/div/div[2]/div[2]/div/div/div/form/label/input[1]"));

        // search box - using traditional selector
        driver.findElement(By.xpath("//input[@type='text']"));

        // sign in button - using traditional selector
        driver.findElement(By.xpath("//a[@href='/login']"));

        // sign in button - using traditional selector + wild character for tag name
        driver.findElement(By.xpath("//*[@href='/login']"));

        // username text box - using traditional selector + multiple attributes for better selection
//        driver.findElement(By.xpath("//input[@name='user[login]'][@type='text']"));

        // username text box - using traditional selector + multiple attributes + AND condition
//        driver.findElement(By.xpath("//input[@name='user[login]' and @type='text']"));

        // username text box - using traditional selector + multiple attributes + OR condition
//        driver.findElement(By.xpath("//input[@name='user[login]' or @type='text']"));

        // Enterprise link - using text() method
        // precaution - text should match exactly (new extra newline characters)
        driver.findElement(By.xpath("//a[text()='Enterprise']"));
        driver.findElement(By.xpath("//a[text()='Marketplace']"));

        // username text box - using contains() method
        driver.findElement(By.xpath("//input[contains (@name, 'user')]"));
        driver.findElement(By.xpath("//input[contains (@type, 'text')]"));

        // username text box - using contains() method
        // An example to find element having multiple class names
//        driver.findElement(By.xpath("//input[contains (@class, 'form-control form-control-lg input-block')]"));

        // username text box - using contains() method + text method
        driver.findElement(By.xpath("//a[contains (text(), 'Marketplace')]"));

        // Why Github link - using startsWith() method
        driver.findElement(By.xpath("//summary[starts-with(@class, 'HeaderMenu-summary HeaderMenu-link')]"));

        // Team link - using startsWith() + text() method
        driver.findElement(By.xpath("//a[starts-with(text(), 'Team')]"));

        // 2nd Password text box - using index to find nth element
//        driver.findElement(By.xpath("//auto-check[contains(@src,'/users/password')]/input[2]"));

        // Sign up your team button - using chained xpath
//        driver.findElement(By.xpath("//div[@class='text-center']//a[contains(@href, '/join?')]"));



        driver.quit();
    }

}
