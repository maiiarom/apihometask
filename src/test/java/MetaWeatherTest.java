import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class MetaWeatherTest {

    @Test
    public void getLocation(){
        given().baseUri("https://www.metaweather.com/")
                .basePath("api/location/44418")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200);
    }
}
