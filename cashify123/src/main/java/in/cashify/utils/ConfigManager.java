package in.cashify.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
	
    private static ConfigManager configManager;
	private final Properties properties;
	
    public ConfigManager() throws IOException {
		InputStream input=ConfigManager.class.getClassLoader().getResourceAsStream("Config.properties");
	properties=LoadProperties.propertyLoader("../cashify123/Config.properties");
		properties.load(input);
    }
	    public static ConfigManager getInstance(){
	        if (configManager == null) {
	            try {
	             configManager = new ConfigManager();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	        return configManager;
	    }

	    public String getString(String key){
	        return properties.getProperty(key);

	    }
		
	}

