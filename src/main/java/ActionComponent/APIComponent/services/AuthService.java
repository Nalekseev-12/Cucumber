package ActionComponent.APIComponent.services;

import ActionComponent.APIComponent.models.User;


public interface AuthService extends BasicService{

    User createUser(User user);
    String login();
    String login2();
}
