package steps;


import ActionComponent.Action;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewItemPageSteps  {
    private final Action action;

    private final By titleNewItemPage = By.xpath("//*[@class='selection-page__title h2 italic ng-star-inserted']");
    private final By buttonBrand = By.xpath("//*[@class='product-list__content-wrap']/filter-desktop/div[2]");
    private final By checkBoxMacQueen = By.xpath("//*[@class='filter__filter-wrap']/div[4]");
    private final By elementOfPageLoading = By.xpath("//*[@class='state-loading']");
    private final By listOfProductsOnThePage = By.xpath("//*[@class='product__brand']");
    private final By buttonSort = By.xpath("//*[@class='select__current']");
    private final By buttonSortByPriceAscending = By.xpath("//*[@class='select__body']/li[3]");
    private final By listOfPriceProducts = By.xpath("//*[@class='price ng-star-inserted']");

    public NewItemPageSteps(Action action) {
        this.action = action;
    }

    @Тогда("проверям что перешли во вкладку Новинки для мужчин")
    public void checkSwitchToMale() {
        action.assertEqualsString(action.getText(titleNewItemPage), "Новинки для мужчин");
    }

    @Тогда("проверям что перешли во вкладку Новинки для детей")
    public void checkSwitchToKids() {
        action.assertEqualsString(action.getText(titleNewItemPage), "Новинки для детей");
    }

    @Тогда("проверям что перешли во вкладку Новинки для женщин")
    public void checkSwitchToFemale() {
        action.assertEqualsString(action.getText(titleNewItemPage), "Новинки для женщин");
    }

    @Когда("нажимаем на кнопку брэнд")
    public void clickButtonBrand() {
        action.clickButton(buttonBrand);
    }

    @Когда("нажимаем на чек-бокс  Alexander McQueen")
    public void clickCheckBoxAlexanderMcQueen() {
        action.clickButton(checkBoxMacQueen);
    }

    @Когда("ожидаем исчезновения элемента загрузки страницы")
    public void waitInvisibilityElementOfPageLoading() {
        action.waitInvisibilityOfElementLocated(elementOfPageLoading);
    }

    @Тогда("проверяем что на странице только товары Alexander McQueen")
    public void checkOnThePageOnlyProductsAlexanderMcQueen() {
        int i = 0;
        List <WebElement> listOfProducts = action.getElements(listOfProductsOnThePage);
        for (WebElement ignored : listOfProducts) {
            action.assertEqualsString(action.getText(listOfProducts.get(i)), "ALEXANDER MCQUEEN");
            i ++;
        }
    }

    @Когда("нажимаем на кнопку сортировка")
    public void clickOnTheButtonSort() {
        action.clickButton(buttonSort);
    }

    @Когда("нажимаем на сортировка по возрастанию цены")
    public void sortByPriceAscending() {
        action.clickButton(buttonSortByPriceAscending);
    }

    @Тогда("проверяем что товары отсортированы по возрастанию цены")
    public void checkProductsSortedByAscending() {
        List <WebElement> listOfPrice = action.getElements(listOfPriceProducts);
        for (int i = 0; i < 59; i++) {
            action.assertTrueMoreLess(Integer.parseInt(action.getText(listOfPrice.get(i)).replaceAll("[ ₽]", "")), Integer.parseInt(action.getText(listOfPrice.get(i+1)).replaceAll("[ ₽]", "")) + 1) ; // здесь прибавил +1 на случай если одинаковые цены
        }
    }
}
