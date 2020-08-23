package steps.WebSteps;


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
        web.clickButton(searchButton);
    }

    @Когда("вводим в поле поиска DOLCE")
    public void inputInSearch() {
        web.input(fieldSearch, "DOLCE");
        web.input(fieldSearch, Keys.ENTER);
    }

    @Тогда("проверяем корректность отображения брэнда")
    public void checkBrand() {
        web.assertEqualsString(web.getAttribute(brandName, "alt"), "Dolce & Gabbana");
    }
}
