package pages.cardFormPage;

import feature.ElementAction;
import io.qameta.allure.Step;

public class CardFillingFormActions {

    @Step("Вводим {lastName} в поле Фамилия")
    public static void sendLastName(String lastName) {
        ElementAction.isClickableSendKeysXpath(CardFillingFormElements.fieldLastName(), lastName);
    }

    @Step("Вводим {name} в поле Имя")
    public static void sendName(String name) {
        ElementAction.isClickableSendKeysXpath(CardFillingFormElements.fieldName(), name);
    }

    @Step("Клик по чекбоксу Нет отчества")
    public static void clickCheckBoxNoMiddleName() {
        ElementAction.clickCss(CardFillingFormElements.checkboxNoMiddleName());
    }

    @Step("Вводим {phoneNumber} в поле Мобильный телефон")
    public static void sendPhone(String phoneNumber) {
        ElementAction.isClickableSendKeysXpath(CardFillingFormElements.fieldPhone(), phoneNumber);
    }


    @Step("Выбор г.Москва из списка для получения карты")
    public static void clickGetCapital() {
        ElementAction.clickCss(CardFillingFormElements.fieldGetCapitalMoscow());
    }

    @Step("Выбор города из списка для получения карты")
    public static void clickSelectCountry() {
        ElementAction.clickCss(CardFillingFormElements.fieldSelectCountry());
    }

    @Step("Клик по полю выбора города получения карты")
    public static void clickGetCountry() {
        ElementAction.click(CardFillingFormElements.fieldGetCountry());
    }
}
