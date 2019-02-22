package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {

    private static Properties properties;

    static {
        String path = "configurations.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (Exception e) {
            System.out.println("path: " + path + " NOT FOUND");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }


}
