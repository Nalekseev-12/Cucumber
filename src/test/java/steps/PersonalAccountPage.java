package steps;

import ActionComponent.Action;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

public class PersonalAccountPage extends AbstractPage {


    private final By labelPersonalAccount = By.xpath("//*[@style='visibility: visible;']");
    private final By elementWithTextAccount = By.xpath("//*[@class='header__link ng-star-inserted']");
    private final By buttonExit = By.xpath("//*[@class='personal__nav-item']/a");


    @Тогда("проверям что авторизовались")
    public void checkAuthorization() {
        action.assertEqualsString(action.getText(elementWithTextAccount), "alekse-nikita@yandex.ru");
    }

    @Когда("ждем появления элемента отображения email после авторизации")
    public void waitElementLabelPersonalAccount() {
        action.waitDisplayedElement(labelPersonalAccount);
    }

    @Когда("нажимаем на кнопку Выход")
    public void clickExit() {
        action.clickButton(buttonExit);
    }
}
