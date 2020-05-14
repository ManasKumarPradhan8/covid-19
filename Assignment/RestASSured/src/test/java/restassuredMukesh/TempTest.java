package restassuredMukesh;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TempTest {
	@Test
	RestAssured.baseURI="https://maps.googleapis.com";
	given().
	param("location","-33.8670522,151.1957362").
	param("radious","1500").
	param("key","AIzaSyCd_a_cc2xFTuAMnqu17IoWGiGSzwN9_1o").
	/*header("rds","uytg").
	cookie("jknjnmn","bhbbmn").
	body()*/
	when().
	get("/maps/api/place/nearbysearch/json").
	then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("results[0].name",equals(""))/*body("results[0].name",equalTo("sydney1")*/);
	

}
