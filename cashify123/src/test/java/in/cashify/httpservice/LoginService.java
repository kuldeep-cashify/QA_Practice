package in.cashify.httpservice;

import com.google.gson.Gson;
import Models.TokenResponseParam;
import in.cashify.utils.UrlBuilder;
import java.util.Map;

public class LoginService {
	
	private  static final String tokenendpoint="v1/oauth/token";
	
	public static TokenResponseParam tokentest() {
    String url = UrlBuilder.getUrl("cas");  
    Gson gson = new Gson();
    String json=LoginTest.login(url, tokenendpoint);
   TokenResponseParam param=gson.fromJson(json, TokenResponseParam.class);
   Map<String, String> data = GlobalProvider.getInstance().getData();
   data.put("token", param.getAccess_token());

   return param;
		
	}
	
}