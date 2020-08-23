package steps.APISteps;


import ActionComponent.APIComponent.impl.AuthServiceImpl;
import ActionComponent.APIComponent.models.User;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import ActionComponent.APIComponent.services.AuthService;

public class UserSteps {
    AuthService authSer = new AuthServiceImpl();

    @Дано("создаем нового пользователя")
    public void createNewUser() {
        User newUser = User.builder()
                .email("email@gmail.com")
                .firstName("firstName")
                .lastName("lastName")
                .password("password")
                .build();

        User createUser = authSer.createUser(newUser);
        Assert.assertNotNull(createUser);
    }




    @Тогда("логинимся")
    public void loginByUser() {
        Assert.assertEquals("login 1", authSer.login(),"application/json");
    }
}
