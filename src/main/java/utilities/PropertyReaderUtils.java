package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtils {
    private Properties prop;
    /**
     * This method is used to load the properties from config.properties file
     * @return it returns Properties prop object
     */
    public Properties readPropertiesFile(String propertiesFilePath) {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream(propertiesFilePath);
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
    /**
     * This section is to write data String to a property file
     */
    public void  writeIdToPropertyFile(String strFilePath, String strId) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("id", strId);

        FileOutputStream file = new FileOutputStream(strFilePath);
        properties.store(file, "Write the String value for Id in the file..");
        file.close();
    }
    public String readIdFromPropertyFile(String strFilePath) throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream(strFilePath);
        properties.load(file);
        file.close();
        return properties.getProperty("id");
    }
}
