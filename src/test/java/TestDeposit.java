import config.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;
import pages.holdingsPage.HoldingPageActions;
import pages.homePage.HomePageActions;

public class TestDeposit extends Configuration {

    @Test
    @Owner("Федоров И.В")
    @Link(name = "Ссылка ренкредит", url = "https://rencredit.ru/")
    @Description("Тестирование выбора суммы и срока вклада")

    public void TestSelectDeposit() {
        HomePageActions.clickButtonHoldings();
        HoldingPageActions.clickCheckboxDepositBank();
        HoldingPageActions.inputAmountDeposit("650000");
        HoldingPageActions.dragDropAmount();
        HoldingPageActions.downloadFile();
    }
}
