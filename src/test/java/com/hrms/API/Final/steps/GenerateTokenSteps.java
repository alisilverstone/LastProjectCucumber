package com.hrms.API.Final.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import com.hrms.utils.APIConstants;

public class GenerateTokenSteps {

	//String BaseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	static public String token;

	@Given("a JWT is generated")
	public void a_JWT_is_generated() {

		/** Preparing request to generate token */
		RequestSpecification generateTokenRequest = given().header("Content-Type", "application/json")
				.body("{\n" + "  \"email\": \"email@email.com\",\n" + "  \"password\": \"syntax123\"\n" + "}\n" + "");

		/** Storing response into generateTokenResponse */
		Response generateTokenResponse = generateTokenRequest.when().post(APIConstants.GENERATE_TOKEN_URI);

		/** Optional to print response */
		generateTokenResponse.prettyPrint();

		/**
		 * Storing token as a static global variable that will be used for other calls
		 */
		token = "Bearer " + generateTokenResponse.jsonPath().getString("token");

	}
}
