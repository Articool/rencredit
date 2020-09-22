package pages.holdingsPage;

import feature.ElementAction;
import io.qameta.allure.Step;

public class HoldingPageActions {

    @Step("Кликаем чекбокс 'В отделении банка'")
    public static void clickCheckboxDepositBank() {
        ElementAction.click(HoldingPageElements.checkboxDepositBank());
    }

    @Step("Вводим сумму {text} вклада")
    public static void inputAmountDeposit(String text) {
        ElementAction.isClickableSendKeysXpath(HoldingPageElements.amountDeposit(), text);
    }

    @Step("Клик на чекбокс 'В отделении банка'")
    public static void dragDropAmount() {
        ElementAction.moveActionHome(HoldingPageElements.dragDropPeriod());
    }

    @Step("Скачиваем файл")
    public static void downloadFile() {
        ElementAction.downloadFile(HoldingPageElements.urlDownloadDoc());
    }
}
