package in.cashify.httpservice;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class LoginTest {
	
	static String grant_type="implicit";
	static String client_id="gadget-pro";
	static String client_version="v1";

	
	public static String login(String baseuri, String endpoint) {
		
     RestAssured.baseURI = baseuri;
        String response = given()
                .log().all()
                .header("Content-Type", "application/x-www-form-urlencoded")
                .queryParams("grant_type", grant_type, "client_id", client_id, "client_version" , client_version)
                .when()
                .post(endpoint)
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .extract().response().asString();
        
        return response;


	}



}
