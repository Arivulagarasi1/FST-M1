package Activity;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Project_RestAssured {
	RequestSpecification requestSpec;
	String SSH_key;
	int idKey;
	
  @BeforeClass
  public void setup() {
	  requestSpec = new RequestSpecBuilder()
			        .setContentType(ContentType.JSON)
			        .addHeader("Authorization", "token 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")
			        .setBaseUri("https://api.github.com")
			        .build();
  }
  @Test(priority=1)
  public void postRequest() {
	  String reqBody = "{\"title\": \"TestKey\", \"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC7QOklIMIxKXATfHLkj+TBtXVjyrngMAg4MMBbWuKLv0rzgOPYtqWFDmot64MV2yx1+PUci7B9N0ZoN3/8LhPqqFVYOyXZ3Tmog94IALQtBST/EpQB7aFQLlWJrty7Jy4Wphw2jyXitkGowTybXoeqtQFhRmZjMPdrbU5r3zIrsLm5rS2se9N9LhC+3sO5unoO5bgiu6F04pRi9KtQKAP9xH9e80CN9PkVcg1U1n3EOZnDkzGt7x7GpdFZgrQQLC7sxlRucqPscf4lKPwHZUWCzkXtBiNSX10hJFNFFXYxK1ECrmTVPKPNyzMhKilnoF2g7DR7nyHi3xQpy2jk3PWiQXNOoMOlz7fqNBRwzETDitu+aLTwLoXNhIbI3a9Fb8pwe+CuZ9kqhgDcTvxWeJmoXV23svtUV3ol3d6NgS1EZFc8RmLYMfOxmJssuUo6040MTn/sda/gvnErAY9CqsjvXnIPOjYHJMTiskxxjQNihujqEreqY2X9OdaAXmsgX5c=\", \"read_only\": \"true\"}";
	  Response response = 
		        given().spec(requestSpec)
		        .body(reqBody)
		        .when().post("/user/keys").then().extract().response();
	  
	  idKey=response.path("id");
	  System.out.println(idKey);
	  String body = response.asPrettyString();
	  System.out.println(body);
      response.then().statusCode(201);
  }
  
  @Test(priority=2)
  public void getRequest() {
	  Response response = 
		        given().spec(requestSpec)
		        .get("/user/keys");

	  String body = response.getBody().asPrettyString();
	  System.out.println(body);
	  response.then().statusCode(200);
  }
  
  @Test(priority=3)
  public void deleteRequest() {
	  Response response = 
		        given().spec(requestSpec)
		        .when()
		        .pathParam("keyId", idKey)
		        .delete("/user/keys/{keyId}");
		 
	  String body = response.getBody().asPrettyString();
	  System.out.println(body);
	  response.then().statusCode(204);
  }
}
