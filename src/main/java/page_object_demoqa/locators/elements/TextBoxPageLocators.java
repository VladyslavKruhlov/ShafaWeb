package page_object_demoqa.locators.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPageLocators {
    public static final SelenideElement TEXT_BOX_TITLE = $("h1.text-center");
    public static final SelenideElement FULL_NAME_FIELD_TITLE = $("#userName-label");
    public static final SelenideElement FULL_NAME_FIELD = $("#userName");
    public static final SelenideElement EMAIL_FIELD_TITLE = $("#userEmail-label");
    public static final SelenideElement EMAIL_FIELD = $("#userEmail");
    public static final SelenideElement CURRENT_ADDRESS_FIELD_TITLE = $("#currentAddress-label");
    public static final SelenideElement CURRENT_ADDRESS_FIELD = $("#currentAddress");
    public static final SelenideElement PERMANENT_ADDRESS_FIELD_TITLE = $("#permanentAddress-label");
    public static final SelenideElement PERMANENT_ADDRESS_FIELD = $("#permanentAddress");
    public static final SelenideElement SUBMIT_BUTTON = $("#submit");
    public static final SelenideElement TOTAL_INFO_FIELD = $("#output");
}