package steps.WebSteps;

import ActionComponent.QAConfig;
import io.cucumber.java.After;
import io.cucumber.java.ru.Дано;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = QAConfig.class)
public class DefaultSteps extends AbstractPage {


    @Дано("переходим на страницу {string}")
    public void go(String url) {
        web.get(url);
    }

    @Дано("задаем стандартное время ожидания {long} секунд")
    public void setImplicitlyWait(Long second) {
        web.setImplicitlyWait(second);
    }

    @After
    public void reopen() {
        web.reopenDriver();
    }



}
