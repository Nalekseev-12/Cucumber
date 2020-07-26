package steps;

import ActionComponent.Action;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

public class GiftCardsPageSteps {
    private final Action action;

    private final By titleGiftCards = By.xpath("//*[@class='gift-buy__title']/h1");

    public GiftCardsPageSteps(Action action) {
        this.action = action;
    }

    @Тогда("проверяем что переключилсь на вкладку Подарочные карты")
    public void checkSwitchToGiftCards() {
        action.assertEqualsString(action.getText(titleGiftCards), "ПОДАРОЧНАЯ КАРТА");
    }
}
