package page_object_demoqa.locators.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class WebTablesPageLocators {
    public static SelenideElement PAGE_TITLE = $x("//h1[@class='text-center']");
    public static SelenideElement ADD_BUTTON = $("#addNewRecordButton");
    public static SelenideElement SEARCH_FIELD = $("#searchBox");
    public static ElementsCollection TABLE_LIST = $$("div[class='rt-tbody']");
    public static ElementsCollection TABLE_ROW_LIST = $$("div[class='rt-tbody'] .rt-tr-group");
    public static SelenideElement EDIT_BTN = $x("//*[@title='Edit']");
    public static SelenideElement DELETE_BTN = $x("//*[@title='Delete']");
    public static SelenideElement SUBMIT_BTN = $("#submit");
    public static SelenideElement CLOSE_REGISTRATION_FORM_BTN = $("button[class='close']");
    public static SelenideElement REGISTRATION_IFRAME_TITLE = $("#registration-form-modal");
    public static SelenideElement FIRST_NAME_FIELD = $("#firstName");
    public static SelenideElement LAST_NAME_FIELD = $("#lastName");
    public static SelenideElement EMAIL_FIELD = $("#userEmail");
    public static SelenideElement AGE_FIELD = $("#age");
    public static SelenideElement SALARY_FIELD = $("#salary");
    public static SelenideElement DEPARTMENT_FIELD = $("#department");
    public static SelenideElement CHANGE_ROWS_COUNT_BTN = $("select[aria-label='rows per page']");
}