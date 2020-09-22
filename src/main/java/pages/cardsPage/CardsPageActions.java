package pages.cardsPage;

import feature.ElementAction;
import io.qameta.allure.Step;

public class CardsPageActions {

    @Step("Клик по кнопке Заполнить заявку на карту 365")
    public static void clickButtonOutCardApplication() {
        ElementAction.click(CardsPageElements.buttonOutCardApplication());
    }
}
