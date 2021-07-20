package in.cashify.httpservice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import Models.BrandsResponseParam;
import in.cashify.utils.UrlBuilder;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.net.URISyntaxException;


public class BrandService {
	static String brandendpoint="pd01/v1/brands";
	
    @Test(dataProvider = "data", dataProviderClass = DataProvider.class)
    public  void brands(String token) throws IOException, URISyntaxException {
        String key = ServiceProvider.serviceKey("product-discovery");
        String url = UrlBuilder.getUrl(key);

        RestAssured.baseURI = url;
        String response = given()
                .log().all()
                .contentType(" application/json")
                .header("X-AUTHORIZATION", token)
                .queryParams("serid", "2", "souid", "1", "pin", "122001", "plid", "20")
                .when()
                .get(brandendpoint)
                .then()
                .extract().response().asString();
        System.out.println(response);
        Gson gson = new Gson();
        BrandsResponseParam brandobject = gson.fromJson(response, BrandsResponseParam.class);
        System.out.println(brandobject.getPln());
        System.out.println(brandobject.getDt().get(3).getBi());
        brandobject.setPli(brandobject.getPli().toString());
        brandobject.setDt(brandobject.getDt());
        
        
    }
}


