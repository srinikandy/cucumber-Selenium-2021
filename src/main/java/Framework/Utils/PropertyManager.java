package Framework.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
    // get environment details which passed via Maven goal called "env" -Denv = qa
    private static String environment = System.getProperty("env"); //qa or uat
    private static FileInputStream fileInput;
    private static Properties properties;

    private static String propertiesFolderPath = System.getProperty("user.dir")
            + File.separator + "Properties" + File.separator;
    private static String propertiesFilePath = propertiesFolderPath + environment + ".properties";

    public static String readProperty(String propertyName) throws IOException {
        try{
            fileInput = new FileInputStream(propertiesFilePath);
        }catch(FileNotFoundException fe){
            throw new FileNotFoundException("please check file name");
        }
        try {
            properties = new Properties();
            properties.load(fileInput);
        }finally {
            fileInput.close();
        }
        return properties.getProperty(propertyName);
    }
}
