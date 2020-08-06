package steps;

import ActionComponent.Action;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPageSteps extends AbstractPage {


    private final By searchButton = By.xpath("//*[@class='button__icon button__icon_find']");
    private final By fieldSearch = By.xpath("//*[@class='field__input']");
    private final By brandName = By.xpath("//*[contains(@class,\"brand-info__logo\")]");


    @Когда("нажимаем на кнопку Поиск")
    public void clickSearch() {
        action.clickButton(searchButton);
    }

    @Когда("вводим в поле поиска DOLCE")
    public void inputInSearch() {
        action.input(fieldSearch, "DOLCE");
        action.input(fieldSearch, Keys.ENTER);
    }

    @Тогда("проверяем корректность отображения брэнда")
    public void checkBrand() {
        action.assertEqualsString(action.getAttribute(brandName, "alt"), "Dolce & Gabbana");
    }
}
