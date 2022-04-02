import org.sikuli.script.Key;
import org.sikuli.script.Screen;



// Need to use external jar
//   sikulixapi-1.1.1.jar
//   bridj-0.7.0.jar



public class DemoSikuli {

    public static void main(String[] args) throws Exception{

        Thread.sleep(6000);
        Screen currentScreen = new Screen();
        Thread.sleep(1000);
        currentScreen.type("https://www.flipkart.com/");
        currentScreen.type(Key.ENTER);
        Thread.sleep(3000);
        currentScreen.mouseMove(currentScreen.getTopRight());
        Thread.sleep(1000);
        currentScreen.mouseMove(currentScreen.getBottomLeft());

    }

}
