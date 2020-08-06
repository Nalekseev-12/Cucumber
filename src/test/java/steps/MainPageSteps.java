package steps;

import ActionComponent.Action;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

public class MainPageSteps extends AbstractPage {

    private final String User = "test";
    private final String Password = "test";

    private final By closePopUpButton = By.xpath("//*[@class='geo-popup__close-icon']");
    private final By buttonSectionForMen = By.xpath("//*[@class='header__gender-switch header__gender-switch_desktop']/span[contains(text(), \"Мужское\")]");
    private final By buttonLogin = By.xpath("//*[@class='header__link ng-star-inserted']");
    private final By fieldEmail = By.xpath("//*[contains (@class, \"ui-input login-input\")]");
    private final By fieldPassword = By.xpath("//*[contains (@class, \"ui-input pwd-input\")]");
    private final By buttonSignIn = By.xpath("//*[contains (@class, \"i-button ui-button\")]");
    private final By labelPersonalAccount = By.xpath("//*[@style='visibility: visible;']");
    private final By elementWithTextAccount = By.xpath("//*[@class='header__link ng-star-inserted']");
    private final By buttonMale = By.xpath("//*[@class='header__gender-switch header__gender-switch_desktop']/span[2]");
    private final By buttonNewItem = By.xpath("//*[@class='header__link header__link_type_nav'][contains(text(), \"Новинки\")]");
    private final By buttonKids = By.xpath("//*[@class='header__gender-switch header__gender-switch_desktop']/span[3]");
    private final By buttonGiftCards = By.xpath("//*[@title='Подарочные карты']");
    private final By buttonApple = By.xpath("//*[@title='Apple']");
    private final By buttonInterior = By.xpath("//*[@title='Интерьер']");


    @Когда("закрываем поп-ап выбора города")
    public void closePopUp(){
        action.clickButton(closePopUpButton);
    }

    @Когда("нажимаем на кнопку Личный кабинет")
    public void clickButtonLogin() {
        action.clickButton(buttonLogin);
    }

    @Когда("вводим логин, пароль и нажимаем кнопку войти")
    public void authorization() {
        action.input(fieldEmail, User);
        action.input(fieldPassword, Password);
        action.clickButton(buttonSignIn);
    }

    @Когда("ждем появления элемента отображения Личный кабинет после авторизации")
    public void waitElementLabelPersonalAccount() {
        action.waitDisplayedElement(labelPersonalAccount);
    }

    @Тогда("проверям что вышли из ЛК")
    public void checkAuthorization() {
        action.assertEqualsString(action.getText(elementWithTextAccount), "Личный кабинет");
    }

    @Когда("переключаемся на вкладку мужское")
    public void switchToTabMale() {
        action.clickButton(buttonMale);
    }

    @Когда("нажимаем на вкладку Новинки")
    public void clickOnNewItemTab() {
        action.clickButton(buttonNewItem);
    }

    @Когда("переключаемся на вкладку Детское")
    public void switchToTabKids() {
        action.clickButton(buttonKids);
    }

    @Когда("переключаемся на вкладку Подарочные карты")
    public void switchToTabGiftCards() {
        action.clickButton(buttonGiftCards);
    }

    @Когда("переключаемся на вкладку Apple")
    public void switchToTabApple() {
        action.clickButton(buttonApple);
    }

    @Когда("переключаемся на вкладку Интерьер")
    public void switchToTabInterior() {
        action.clickButton(buttonInterior);
    }



}
