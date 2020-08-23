package steps.WebSteps;


import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

public class GiftCardsPageSteps extends AbstractPage {

    private final By titleGiftCards = By.xpath("//*[@class='gift-buy__title']/h1");


    @Тогда("проверяем что переключилсь на вкладку Подарочные карты")
    public void checkSwitchToGiftCards() {
        web.assertEqualsString(web.getText(titleGiftCards), "ПОДАРОЧНАЯ КАРТА");
    }
}
