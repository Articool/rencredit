package pages.homePage;

import feature.ElementAction;
import io.qameta.allure.Step;

public class HomePageActions {

    @Step("Клик на кнопку Вклады")
    public static void clickButtonHoldings() {
        ElementAction.click(HomePageElements.buttonHoldings());
    }

    @Step("Клик на кнопку Карты")
    public static void clickButtonCards() {
        ElementAction.click(HomePageElements.buttonCard());
    }
}
