package restassuredMukesh;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TC1 {
     @Test(priority=0)
	public void getRequest(){
	//Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	int code=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
	//int code=resp.getStatusCode();
	System.out.println("status code is "+code);
	Assert.assertEquals(200,code,"matched both the result");
	}
     @Test(priority=1)
     public void testbody(){
   // Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
    	 String Body=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
   // String body=resp.asString();
   // System.out.println("body is"+Body);
    long time=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
    System.out.println("response time equlas"+time);
     }
}
