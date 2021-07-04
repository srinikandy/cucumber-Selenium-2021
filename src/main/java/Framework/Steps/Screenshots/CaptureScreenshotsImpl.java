package Framework.Steps.Screenshots;

import Framework.Utils.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshotsImpl extends DriverFactory implements CaptureScreenshots {

    @Override
    public byte[] captureScreenshotAsBytes() {
        byte[] source = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
        return source;
    }

    @Override
    public void captureScreenshotAsFile(String screenshotName) throws IOException {
        File source = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")
                + File.separator +"target"+ File.separator + screenshotName + ".png");
        FileUtils.copyFile(source,destination);
    }
}
