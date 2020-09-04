package settings;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SettingsReader {

    public static void populateSettings() throws IOException {
        SettingsReader reader = new SettingsReader();
        reader.readProperty();
    }

    private void readProperty() throws IOException {
        Properties properties = new Properties();
        InputStream resourceAsStream =  getClass().getResourceAsStream("/Settings.properties");
        properties.load(resourceAsStream);
        Settings.PROD_URL = properties.getProperty("PROD_URL");
        Settings.TEST_URL = properties.getProperty("TEST_URL");
    }

}