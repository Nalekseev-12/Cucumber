package steps;

import ActionComponent.Action;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

public class ApplePageSteps extends AbstractPage {

    private final By titleApple = By.xpath("//*[@class='h2 italic']");

    @Тогда("проверяем что переключилсь на вкладку Apple")
    public void checkSwitchToGiftCards() {
        action.assertEqualsString(action.getText(titleApple), "Apple");
    }
}
