package Framework.Steps.Screenshots;

import java.io.IOException;

public interface CaptureScreenshots {

    byte[] captureScreenshotAsBytes();
    void captureScreenshotAsFile(String screenshotName) throws IOException;

}
