package Framework.Steps.Navigation;

import java.io.IOException;

public interface Navigation {
    void navigateTo(String url) throws IOException;
    void navigateBack();
    void navigateForward();
    void refresh();
    String getCurrentUrl();
    String getTitle();
    void quitDriver();
}
