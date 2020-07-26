package steps;

import ActionComponent.Action;
import io.cucumber.java.After;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Тогда;


public class DefaultSteps {

    private final Action action;


    public DefaultSteps(Action action) {
        this.action = action;
    }


    @Дано("переходим на страницу {string}")
    public void go(String url) {
        action.get(url);
    }

    @Дано("задаем стандартное время ожидания {long} секунд")
    public void setImplicitlyWait(Long second) {
        action.setImplicitlyWait(second);
    }

    @After
    public void destroy() {
        action.quit();
    }
}
