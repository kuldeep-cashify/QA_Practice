package in.cashify.provider;

import java.util.HashMap;
import java.util.Map;


public class GlobalProvider {

    private static GlobalProvider globalProviders;  
    private final Map<String, String> data = new HashMap<>();   

    public static GlobalProvider getInstance() {
        if (globalProviders != null) {
            return globalProviders;
        }
        globalProviders = new GlobalProvider();
        return globalProviders;
    }
    public Map<String, String> getData() {
        return data;
    }
    String getToken()
    {
        return data.get("token");
    }
    String setToken(String access_token )
    {
        return data.put("token", access_token);
    }

}
