package page_object_demoqa.pages.elements;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static page_object_demoqa.ConstantsDemoqa.*;
import static page_object_demoqa.locators.elements.CheckBoxPageLocators.*;

public class CheckBoxPage {
    @Step("Check check box url")
    public CheckBoxPage checkCheckBoxUrl(){
        assertEquals(WebDriverRunner.url(), DEMOQA_ELEMENTS_CHECK_BOX_URL);
        assertEquals($(CHECK_BOX_TITLE).getText(), TITLE_CHECK_BOX);
        return this;
    }

    @Step("Check check box page main elements")
    public CheckBoxPage checkCheckBoxPageMainElements(){
        assertTrue((HOME_FOLDER_TITLE).isDisplayed());
        assertTrue((SHOW_ALL_CHECKBOXES_BTN).isDisplayed());
        $(SHOW_ALL_CHECKBOXES_BTN).shouldBe(clickable);
        assertTrue((HIDE_ALL_CHECKBOXES_BTN).isDisplayed());
        $(HIDE_ALL_CHECKBOXES_BTN).shouldBe(clickable);
        return this;
    }

    @Step("Click to show all checkboxes")
    public CheckBoxPage clickToShowAllCheckboxes(){
        $(SHOW_ALL_CHECKBOXES_BTN).click();
        CHECKBOXES_FOLDERS_LIST.forEach(folder->folder.shouldBe(visible));
        assertEquals(CHECKBOXES_FOLDERS_LIST.size(), 17);
        ALL_CHECKBOXES.forEach(checkbox -> checkbox.shouldNotBe(selected));
        assertEquals(ALL_CHECKBOXES.size(), 17);
        return this;
    }

    @Step("Click to hide all checkboxes")
    public CheckBoxPage clickToHideAllCheckboxes(){
        $(HIDE_ALL_CHECKBOXES_BTN).click();
        ALL_CHECKBOXES.forEach(checkbox -> checkbox.shouldNotBe(selected));
        assertEquals(ALL_CHECKBOXES.size(), 1);
        return this;
    }
    @Step("Click to Home checkbox")
    public CheckBoxPage clickToHomeCheckbox(){
        $(HOME_CHECKBOX).shouldNotBe(selected);
        $(HOME_CHECKBOX).click();
        return this;
    }

    @Step("Check result section after all checkboxes selected")
    public CheckBoxPage checkResultSectionWhenAllSelected(){
        ALL_CHECKBOXES.forEach(checkbox -> checkbox.shouldBe(selected));
        executeJavaScript("arguments[0].scrollIntoView(true);", $(SELECTED_RESULTS_FIELD));
        $(SELECTED_RESULTS_FIELD).shouldBe(visible);
        assertTrue((SELECTED_RESULTS_FIELD.getText()).contains(SELECTED_CHECKBOXES_RESULT_TEXT));
        assertTrue((SELECTED_RESULTS_FIELD).getText().contains(SELECTED_DOWNLOADS_WORD_FOLDER_RESULT));
        return this;
    }

    @Step("Open folder tree Home->Documents->Office")
    public CheckBoxPage goToGeneralCheckbox(){
        $(HOME_TREE_BTN).shouldBe(visible).click();
        $(DOCUMENTS_TREE_BTN).shouldBe(visible).click();
        $(OFFICE_TREE_BTN).shouldBe(visible).click();
        $(DOCUMENT_OFFICE_GENERAL_CHECKBOX).shouldBe(visible);
        return this;
    }

    @Step("Select Office/General checkbox")
    public CheckBoxPage clickToGeneralCheckbox(){
        $(ONE_CHECKBOX).shouldNotBe(selected);
        $(DOCUMENT_OFFICE_GENERAL_CHECKBOX).click();
        $(ONE_CHECKBOX).shouldBe(selected);
        return this;
    }

    @Step("Check result section after one checkbox selected")
    public CheckBoxPage checkResultSectionWhenOneSelected(){
        executeJavaScript("arguments[0].scrollIntoView(true);", $(SELECTED_RESULTS_FIELD));
        $(SELECTED_RESULTS_FIELD).shouldBe(visible);
        assertTrue((SELECTED_RESULTS_FIELD.getText()).contains(SELECTED_CHECKBOXES_RESULT_TEXT));
        assertTrue((SELECTED_RESULTS_FIELD).getText().contains(SELECTED_DOCUMENTS_OFFICE_FOLDER_RESULT));
        return this;
    }
}