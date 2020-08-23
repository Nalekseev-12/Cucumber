package ActionComponent.APIComponent.config;


import lombok.Getter;

@Getter
public class EnvConfig {
    private static final String PASSWORD = "abc123";
    private static final String USERNAME ="test";
    public static final String BASIC_URL = "https://petstore.swagger.io/v2/user/";
    public static final String URL_LOGIN = BASIC_URL+ "login?" + "username="+USERNAME+"&"+"password"+"="+PASSWORD;
}
