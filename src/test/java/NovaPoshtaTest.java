import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class NovaPoshtaTest {
    @Test
    public void postSearchSettlements(){
        String jsonString = "{\n" +
                "\"apiKey\": \"4cb1b38edc4dcbe2cdfda1c4cca98b23\",\n" +
                " \"modelName\": \"Address\",\n" +
                "    \"calledMethod\": \"searchSettlements\",\n" +
                "    \"methodProperties\": {\n" +
                "        \"CityName\": \"61045\",\n" +
                "        \"Limit\": 5\n" +
                "    }\n" +
                "}";

        String str  = given().baseUri("https://api.novaposhta.ua/")
                .basePath("v2.0/json/Address/searchSettlements")
                .body(jsonString)
                .when()
                .post()
                .then()
                .assertThat()
                .statusCode(200).extract().body().asString();

        System.out.println(str);
    }
}
