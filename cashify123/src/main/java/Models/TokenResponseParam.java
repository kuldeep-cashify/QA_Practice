package Models;

import java.util.List;

public class TokenResponseParam {
	
	//private String token_type;
	private String access_token;
	List<Ser> ser;

	
//	public void setToken_type(String token_type) {
//		this.token_type = token_type;
//	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}


	public List<Ser> getSer() {
		return ser;
	}

	public void setSer(List<Ser> ser) {
		this.ser = ser;
	}

	
//	public String getToken_type() {
//		return token_type;
//	}
	
	public String getAccess_token() {
		return access_token;
	}
	


}
