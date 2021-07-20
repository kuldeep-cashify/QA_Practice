package in.cashify.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {

    public static Properties propertyLoader(String filePath) throws IOException {
        InputStream input = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(input);
		return properties;
        
    }
}
