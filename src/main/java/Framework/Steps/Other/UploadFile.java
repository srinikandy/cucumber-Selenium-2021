package Framework.Steps.Other;

import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class UploadFile {

    public void uploadUsingRobot(String attachment) throws AWTException {
        String FilePath = System.getProperty("user.dir")+ File.separator+attachment;
        System.out.println("attachment File path is:"+FilePath);
            //Java AWT (Abstract Window Toolkit)
            //Set Transferable content
            StringSelection stringSelection = new StringSelection(FilePath);
            //copy content to clip board
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(stringSelection, null);

            //Perform mouse/keys action
            Robot robot = new Robot();
		/*
		 keyPress will send an event that a key has been pressed down.
		 keyRelease will send the event that the key has been released.
		 */
            //Press Ctrl+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            //Press Enter key
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void uploadFile(WebElement element,String file){
        element.sendKeys(file);
    }
}
