package in.cashify.utils;

public class UrlBuilder {
	
	    public static String getUrl(String ser) {

	        String env = System.getenv("env");

	        if (env.isEmpty()) {
	            env = "stage";
	        }
	        String baseurl;
	        if (env.equalsIgnoreCase("prod")) {
	            baseurl = "api.cashify.in";
	        } else {
	            baseurl = ConfigManager.getInstance().getString("baseUrl");
	        }

	        return "http://+ baseurl+"+ser + "." + baseurl;

	    }

	}


