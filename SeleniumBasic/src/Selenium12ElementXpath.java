import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium12ElementXpath {

    public static void main(String[] args) throws Exception{

        String chromeDriverPath = "E:\\TonyStark\\SeleniumBasic\\browserdriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

        driver.get("http://demo.automationtesting.in/Register.html");
        Thread.sleep(7000);





        // using ancestor expression
        // to select all the parent (and parent of the parent) elements of the current node
        driver.findElement(By.xpath("//input[@placeholder='First Name']//ancestor::div"));

        // using child expression
        // used to find all the child nodes of the current node
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']//child::div[1]"));

        // using descendant expression
        // used to access all the children and sub-children of the current node
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']//descendant::div[1]"));

        // using following expression
        // locates the element after the current node
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']//following::div[1]"));

        // using following-sibling expression
        // it finds nodes on the same level of the current node
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']//following-sibling::div[1]"));

        // using preceding expression
        // used to to select all the nodes present before the current node
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']//preceding::div[1]"));

        driver.quit();
    }

}
