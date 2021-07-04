package Framework.Steps.Screenshots;

import io.cucumber.java.en.And;

import java.io.IOException;

public class CaptureScreenshotsSteps {

    private CaptureScreenshots screenshots = new CaptureScreenshotsImpl();

    @And("user takes screenshot as {string}")
    public void userTakesScreenshotAsGooleSearch_Row(String screenshotName) throws IOException {
        screenshots.captureScreenshotAsFile(screenshotName);
    }
}
