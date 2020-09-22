package pages.cardFormPage;

import feature.ElementXpath;

public class CardFillingFormElements {

    /**
     * Поле Фамилия
     *
     * @return fieldLastName()
     */
    public static String fieldLastName() {
        return ElementXpath.inputId("t1");
    }

    /**
     * Поле Имя
     *
     * @return fieldName()
     */
    public static String fieldName() {
        return ElementXpath.inputId("t2");
    }

    /**
     * Чекбокс нет отчества
     *
     * @return checkboxNoMiddleName()
     */
    public static String checkboxNoMiddleName() {
        return ".form-row:nth-of-type(4) .form-check-row_text_large";
    }

    /**
     * Поле Мобильный телефон
     *
     * @return fieldPhone()
     */
    public static String fieldPhone() {
        return ElementXpath.inputId("t4");
    }

    /**
     * Выбор Столицы получения карты
     *
     * @return fieldGetCapitalMoscow()
     */
    public static String fieldGetCapitalMoscow() {
        return ".CreditRegion.animate-input.jq-selectbox.jqselect.required  ul > li:nth-of-type(3)";
    }

    /**
     * Поле выбор города получения карты
     *
     * @return fieldGetCountry()
     */
    public static String fieldGetCountry() {
        return ElementXpath.divId("s3-styler");
    }

    /**
     * Выбор города получения карты
     *
     * @return fieldSelectCountry()
     */
    public static String fieldSelectCountry() {
        return "div:nth-of-type(8) > .animate-input.jq-selectbox.jqselect.required  ul > li:nth-of-type(28)";
    }
}
