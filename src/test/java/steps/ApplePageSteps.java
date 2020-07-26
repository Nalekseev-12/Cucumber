package steps;

import ActionComponent.Action;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

public class ApplePageSteps {

    private final Action action;

    private final By titleApple = By.xpath("//*[@class='h2 italic']");

    public ApplePageSteps(Action action) {
        this.action = action;
    }

    @Тогда("проверяем что переключилсь на вкладку Apple")
    public void checkSwitchToGiftCards() {
        action.assertEqualsString(action.getText(titleApple), "Apple");
    }
}
