package feature;

public class ElementXpath {

    /**
     * divText()
     * Шаблон элемента xpath
     * div[text()="Вставляемый текст"]
     */
    public static String divText(String text) {
        return "//div[text()='" + text + "']";
    }

    /**
     * divId()
     * Шаблон элемента xpath
     * div[@id="Вставляемый текст"]
     */
    public static String divId(String text) {
        return "//div[@id='" + text + "']";
    }

    /**
     * divClass()
     * Шаблон элемента xpath
     * div[@class="Вставляемый текст"]
     */
    public static String divClass(String text) {
        return "//div[@class='" + text + "']";
    }

    /**
     * inputName()
     * Шаблон элемента xpath
     * input[@name="Вставляемый текст"]
     */

    public static String inputName(String text) {
        return "//input[@name='" + text + "']";
    }

    /**
     * inputId()
     * Шаблон элемента xpath
     * input[@id="Вставляемый текст"]
     */

    public static String inputId(String text) {
        return "//input[@id='" + text + "']";
    }

    /**
     * liText()
     * Шаблон элемента xpath
     * li[text()="Вставляемый текст"]
     */
    public static String liText(String text) {
        return "//li[text()='" + text + "']";
    }

}
