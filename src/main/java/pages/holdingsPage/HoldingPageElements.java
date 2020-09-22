package pages.holdingsPage;

import feature.ElementXpath;

public class HoldingPageElements {
    /**
     * Чекбокс "В отделении банка"
     *
     * @return checkboxDepositBank()
     */
    public static String checkboxDepositBank() {
        return ElementXpath.inputName("deposit_b_n") + "/..";
    }

    /**
     * Поле ввода ссуммы вклада
     *
     * @return amountDeposit()
     */
    public static String amountDeposit() {
        return ElementXpath.inputName("amount") + "/..";
    }

    /**
     * Каретка изменения периода срока вклада
     *
     * @return dragDropPeriod()
     */
    public static String dragDropPeriod() {
        return "[data-property='period'] [tabindex]";
    }
    /**
     * Ссылка на документ
     *
     * @return urlDownloadDoc()
     */
    public static String urlDownloadDoc() {
        return "https://rencredit.ru/upload/iblock/ac3/9_27_20.pdf";
    }
}
