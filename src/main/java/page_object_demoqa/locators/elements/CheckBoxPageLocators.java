package page_object_demoqa.locators.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPageLocators {
    public static final SelenideElement CHECK_BOX_TITLE = $("h1.text-center");
    public static final SelenideElement SHOW_ALL_CHECKBOXES_BTN = $("button.rct-option.rct-option-expand-all");
    public static final SelenideElement HIDE_ALL_CHECKBOXES_BTN = $("button[aria-label='Collapse all']");
    public static final SelenideElement HOME_FOLDER_TITLE = $x("//*[@class='rct-title' and text()='Home']");
    public static final SelenideElement HOME_CHECKBOX = $x("//label[@for='tree-node-home']/span[@class='rct-checkbox']");
    public static final SelenideElement DOCUMENT_OFFICE_GENERAL_CHECKBOX = $x("//label[@for='tree-node-general']/span[@class='rct-checkbox']");
    public static final SelenideElement HOME_TREE_BTN = $x("(//button[@class='rct-collapse rct-collapse-btn'])[1]");
    public static final SelenideElement DOCUMENTS_TREE_BTN = $x("(//button[@class='rct-collapse rct-collapse-btn'])[3]");
    public static final SelenideElement OFFICE_TREE_BTN = $x("(//button[@class='rct-collapse rct-collapse-btn'])[5]");
    public static final ElementsCollection CHECKBOXES_FOLDERS_LIST = $$("span[class='rct-title']");
    public static final SelenideElement SELECTED_RESULTS_FIELD = $("#result");
    public static final ElementsCollection ALL_CHECKBOXES = $$("input[type='checkbox']");
    public static final SelenideElement ONE_CHECKBOX = $("input[id='tree-node-general']");
}