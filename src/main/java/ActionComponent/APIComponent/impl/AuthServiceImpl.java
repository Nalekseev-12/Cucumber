package ActionComponent.APIComponent.impl;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import ActionComponent.APIComponent.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ActionComponent.APIComponent.services.AuthService;

import static ActionComponent.APIComponent.config.EnvConfig.BASIC_URL;
import static ActionComponent.APIComponent.config.EnvConfig.URL_LOGIN;
import static io.restassured.RestAssured.given;


public class AuthServiceImpl implements AuthService {

    public static final Logger log = LoggerFactory.getLogger(AuthServiceImpl.class);

    public User createUser(final User user) {
        final String email = user.getEmail();


        Response response = given()
                .contentType(ContentType.JSON)
                .body(user)
                .post(BASIC_URL);
        if (response.statusCode() == 200) {
            log.error(response.asString());
            return response.as(User.class);
        }
        return null;
    }

    public String login() {
        Response r = given()
                .get(URL_LOGIN);
        return r.contentType().toString();


    }

    public String login2() {


        JsonPath result = given()
                .get(URL_LOGIN)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .jsonPath();
        log.error(result.getString("$"));
        log.error(result.getString("size"));
        return result.getString("$");

    }
}
