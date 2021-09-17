package apiTest.api;

import static io.restassured.RestAssured.*;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * Hello world!!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	
    	  apiTocken();  
    	
    	
    }  
    
    public static String apiTocken()
    {
    	String s="";
    	
    	OAuthClient IoAuthClient = new OAuthClient(new URLConnectionClient());
    	OAuthJSONAccessTokenResponse IOAuthResponse;
    	
    	Response get= given().contentType(ContentType.JSON).get("https://api.coinbase.com/v2/currencies");
    	
    	 	
    	
    	System.out.println(get.prettyPrint());
    	get.asString();
    	System.out.println(get.getStatusCode());
    	
    	return s;
    }
}
