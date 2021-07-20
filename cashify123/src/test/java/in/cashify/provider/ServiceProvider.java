package in.cashify.provider;

import java.io.IOException;
import java.net.URISyntaxException;

import Models.TokenResponseParam;
import in.cashify.httpservice.LoginService;

public class ServiceProvider {
	
    public static String serviceKey(String key) throws URISyntaxException, IOException {
        LoginService loginService = new LoginService();
        TokenResponseParam response = loginService.tokentest();

        for (int i = 0; i < response.getSer().size();) {
            if (response.getSer().get(i).getKey().equalsIgnoreCase(key)) ;
            {
                return response.getSer().get(i).getKey();
            }
        }
        return null;
    }


}
