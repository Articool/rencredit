import config.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;
import pages.cardFormPage.CardFillingFormActions;
import pages.cardsPage.CardsPageActions;
import pages.homePage.HomePageActions;

public class TestCard extends Configuration {

    @Test
    @Owner("Федоров И.В")
    @Link(name = "Ссылка ренкредит", url = "https://rencredit.ru/")
    @Description("Тестирование создание заявки на выпуск карты 365")

    public void TestSelectCard() {
        HomePageActions.clickButtonCards();
        CardsPageActions.clickButtonOutCardApplication();
        CardFillingFormActions.sendLastName("Иванов");
        CardFillingFormActions.sendName("Иван");
        CardFillingFormActions.clickCheckBoxNoMiddleName();
        CardFillingFormActions.sendPhone("9052058798");
        CardFillingFormActions.clickGetCapital();
        CardFillingFormActions.clickGetCountry();
        CardFillingFormActions.clickSelectCountry();
    }
}
