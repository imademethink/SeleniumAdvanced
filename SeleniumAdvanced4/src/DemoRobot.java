import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class DemoRobot {

    public static void main(String[] args) throws Exception{

        Thread.sleep(6000);
        Robot utilRobot = new Robot();

        utilRobot.keyPress(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(2000);

        StringSelection stringSelection = new StringSelection("https://www.flipkart.com/");
        Clipboard clipboard             = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        System.out.println("Pasting from Clipboard");
        utilRobot.keyPress(KeyEvent.VK_CONTROL);
        utilRobot.keyPress(KeyEvent.VK_V);
        utilRobot.keyRelease(KeyEvent.VK_V);
        utilRobot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(1000);

        System.out.println("Pressing Enter Key");
        utilRobot.keyPress(KeyEvent.VK_ENTER);

    }

}
