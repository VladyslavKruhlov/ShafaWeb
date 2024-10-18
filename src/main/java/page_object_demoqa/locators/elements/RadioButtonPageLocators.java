package page_object_demoqa.locators.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RadioButtonPageLocators {
    public static final SelenideElement RADIO_BUTTON_MAIN_TITLE = $("h1[class='text-center']");
    public static final SelenideElement QUESTION_TITLE = $("div[class='mb-3']");
    public static final SelenideElement YES_RADIO_BTN = $("#yesRadio");
    public static final SelenideElement YES_RADIO_BTN_TITLE = $("label[for='yesRadio']");
    public static final SelenideElement IMPRESSIVE_RADIO_BTN = $("#impressiveRadio");
    public static final SelenideElement IMPRESSIVE_RADIO_BTN_TITLE = $("label[for='impressiveRadio']");
    public static final SelenideElement NO_RADIO_BTN = $("#noRadio");
    public static final SelenideElement NO_RADIO_BTN_TITLE = $("label[for='noRadio']");
    public static final SelenideElement RESULT_TITLE = $("p[class='mt-3']");
    public static final ElementsCollection ALL_RADIO_BUTTONS = $$("input[type='radio']");
}