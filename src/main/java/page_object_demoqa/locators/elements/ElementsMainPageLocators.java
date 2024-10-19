package page_object_demoqa.locators.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ElementsMainPageLocators {
    public static final SelenideElement OPTION_LIST = $x("(//*[@class='menu-list'])[1]");
    public static final SelenideElement TEXT_BOX_OPTION = $x("//*[@id='item-0' and span[text()='Text Box']]");
    public static final SelenideElement CHECK_BOX_OPTION = $x("//*[@id='item-1' and span[text()='Check Box']]");
    public static final SelenideElement RADIO_BUTTON_OPTION = $x("//*[@id='item-2' and span[text()='Radio Button']]");
    public static final SelenideElement WEB_TABLES_OPTION = $x("//*[@id='item-3' and span[text()='Web Tables']]");
    public static final SelenideElement BUTTONS_OPTION = $x("//*[@id='item-4' and span[text()='Buttons']]");
    public static final SelenideElement LINKS_OPTION = $x("//*[@id='item-5' and span[text()='Links']]");
    public static final SelenideElement BROKEN_LINKS_OPTION = $x("//*[@id='item-6' and span[text()='Broken Links - Images']");
}