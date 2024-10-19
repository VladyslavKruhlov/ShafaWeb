package page_object_demoqa.locators.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ButtonsPageLocators {
    public static final SelenideElement BUTTONS_TITLE = $x("//h1[@class='text-center']");
    public static final SelenideElement CLICK_ME_BUTTON = $x("//*[@type='button' and text()='Click Me']");
    public static final SelenideElement DOUBLE_CLICK_BUTTON = $x("//*[@type='button' and text()='Double Click Me']");
    public static final SelenideElement RIGHT_CLICK_BUTTON = $x("//*[@type='button' and text()='Right Click Me']");
    public static final SelenideElement MESSAGE_AFTER_CLICK_ME_BTN = $("#dynamicClickMessage");
    public static final SelenideElement MESSAGE_AFTER_RIGHT_BTN = $("#rightClickMessage");
    public static final SelenideElement MESSAGE_AFTER_DOUBLE_CLICK_BTN = $("#doubleClickMessage");
}