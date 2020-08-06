package ActionComponent;

import gherkin.ast.Scenario;
import io.cucumber.java.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class Action {

    protected WebDriver driver = new Browser().createDriver(BrowserType.CHROME, "-start-maximized");
    protected  WebDriverWait wait = new WebDriverWait(driver, 10L, 125);

    public WebElement getElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> getElements (By by) {return driver.findElements(by);}

    public void openWindow() {
        ((JavascriptExecutor)driver).executeScript("window.open()");
    }

    public void reopenDriver() {
        if (null != driver) {
            driver.quit();
        }
        driver = new Browser().createDriver(BrowserType.CHROME, "-start-maximized");
    }

    public void get(String url) {
        driver.get(url);
    }

    public void setImplicitlyWait(Long seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public void clickButton(By by) {
        getElement(by).click();
    }

    public void input(By by, String data) {
        getElement(by).sendKeys(data);
    }
    public void input(By by, Keys data) {
        getElement(by).sendKeys(data);
    }

    public String getText(By by) {
        return getElement(by).getText();
    }
    public String getText(WebElement webElement) { return webElement.getText(); }

    public void assertEqualsString(String variable1, String variable2){
        Assert.assertEquals(variable1, variable2);
    }
    public void assertTrueMoreLess(int variable1, int variable2) {Assert.assertTrue(variable1 < variable2);}

    public void waitDisplayedElement(By by) {
        wait.until(driver -> getElement(by).isDisplayed());
    }

    public String getAttribute(By by, String attribute) { return getElement(by).getAttribute(attribute);}

    public void waitInvisibilityOfElementLocated(By by) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void quit() {
        driver.quit();
    }

    @PreDestroy
    public void destroy() {
        if (null == driver) {
            return;
        }
        driver.quit();
    }






}
