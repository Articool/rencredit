package pages.homePage;

import feature.ElementXpath;

public class HomePageElements {
    /**
     * Кнопка Вклады
     *
     * @return buttonHoldings()
     */
    public static String buttonHoldings() {
        return ElementXpath.divText("Вклады") + "/..";
    }

    /**
     * Кнопка Карты
     *
     * @return buttonCard()
     */
    public static String buttonCard() {
        return ElementXpath.divText("Карты") + "/..";
    }

}
