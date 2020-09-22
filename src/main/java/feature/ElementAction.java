package feature;

import config.Configuration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ElementAction extends Configuration {

    public static int wait = 30;

    public static void clickOne(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void click(String xpath) {
        try {
            driver.findElement(By.xpath(xpath)).click();
        } catch (StaleElementReferenceException e) {
            //если вдруг элемент обновился то попробуем его повторно кликнуть
            driver.findElement(By.xpath(xpath)).click();
        }
    }

    public static void clickCss(String css) {
        try {
            driver.findElement(By.cssSelector(css)).click();
        } catch (StaleElementReferenceException e) {
            //если вдруг элемент обновился то попробуем его повторно кликнуть
            driver.findElement(By.cssSelector(css)).click();
        }
    }

    public static void isClickableSendKeysXpath(String xpath, String text) {
        click(xpath);
        driver.findElement(By.xpath(xpath)).sendKeys(text);
        System.out.println("Введенный текст: " + text);
    }

    /**
     * Передвинуть ползунок в левую сторону
     *
     * @param css указывается css селектор
     */
    public static void moveActionHome(String css) {
        WebElement slider = driver.findElement(By.cssSelector(css));
        slider.sendKeys(Keys.HOME);
    }

    public static void isVisibility(String xpath) {
        try {
            new WebDriverWait(driver, wait).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } catch (Exception e) {
            throw new AssertionError("Не прошел. Ошибка " + e.toString());
        }
    }


    public static void scrollPageLocation(String css) {
        WebElement scrollLocation = driver.findElement(By.cssSelector(css));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollLocation);
    }

    /**
     * неявное ожидание
     *
     * @param sleep указывается в миллисекундах
     */
    public static void sleep(int sleep) {
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void downloadFile(String url) {
        driver.get(url);
    }
}


