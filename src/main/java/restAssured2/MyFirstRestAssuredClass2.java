package restAssured2;

//import static io.restassured.RestAssured.*;

//import io.restassured.response.Response;
//import io.restassured.matcher.RestAssuredMatchers.*;
//import org.hamcrest.Matchers.*;

public class MyFirstRestAssuredClass2 {
	public static void getResponseBody() {
		//given().when().get("https://demo.guru99.com/v4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log().all();
		//baseURI = "https://demo.guru99.com/v4"; // Base URI from the first request URL
/*
		// Second request
		Response response = given()
                .queryParam("CUSTOMER_ID", "68195")
                .queryParam("PASSWORD", "1234!")
                .queryParam("Account_No", "1")
                .when()
                .get("/sinkministatement.php") // Endpoint
                .then()
                .extract()
                .response();
        // Print the response body

		System.out.println("Response Body: " + response.getBody().asString());
		*/
	}

}
