package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyMap {

    private static Properties properties = new Properties();
    private static FileInputStream stream;
    private static String baseDir = System.getProperty("user.dir");
    /**
     * loads the properties in the property file and all the system properties
     */
    public static Properties getInstance() {
        try {
            stream = new FileInputStream(
                    new File( baseDir+ "/src/test/resources/project.properties"));
            System.getProperties().load(stream);
            properties.putAll(System.getProperties());
            return properties;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}