package steps;

import ActionComponent.QAConfig;
import io.cucumber.java.After;
import io.cucumber.java.ru.Дано;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.PreDestroy;


@ContextConfiguration(classes = QAConfig.class)
public class DefaultSteps extends AbstractPage {


    @Дано("переходим на страницу {string}")
    public void go(String url) {
        action.get(url);
    }

    @Дано("задаем стандартное время ожидания {long} секунд")
    public void setImplicitlyWait(Long second) {
        action.setImplicitlyWait(second);
    }

    @After
    public void reopen() {
        action.reopenDriver();
    }



}
