package moneybox;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Loadprop extends Basepage {
    static Properties prop;
    static FileInputStream input;
    String fileName = "Config.properties";/*create file config file*/
    String fileLocatio = "src\\main\\resources\\Properties\\";

// Get the Config file location and load the object
    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocatio + fileName);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
