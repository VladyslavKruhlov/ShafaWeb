package page_object_demoqa.pages.elements;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static page_object_demoqa.ConstantsDemoqa.*;
import static page_object_demoqa.locators.elements.RadioButtonPageLocators.*;

public class RadioButtonPage {
    @Step("Check radio button url and static elements")
    public RadioButtonPage checkRadioButtonUrl(){
        assertEquals(DEMOQA_BASE_URL+DEMOQA_ELEMENTS_RADIO_BUTTON_URL, WebDriverRunner.url());
        $(RADIO_BUTTON_MAIN_TITLE).shouldBe(visible);
        assertTrue(RADIO_BUTTON_MAIN_TITLE.getText().contains(TITLE_RADIO_BUTTON));
        $(QUESTION_TITLE).shouldBe(visible);
        assertTrue(QUESTION_TITLE.getText().contains(TITLE_OF_QUESTION));
        $(RESULT_TITLE).shouldNotBe(visible);
        return this;
    }
    @Step("Check that result field isn`t visible when radiobutton unselected")
    public RadioButtonPage checkEmptyResultField(){
        ALL_RADIO_BUTTONS.forEach(button->button.shouldNotBe(selected));
        $(RESULT_TITLE).shouldNotBe(visible);
        return this;
    }
    @Step("Check 'Yes' radio button title")
    public RadioButtonPage checkYesRadioBtn(){
        $(YES_RADIO_BTN_TITLE).shouldBe(visible);
        assertTrue(YES_RADIO_BTN_TITLE.getText().contains(RADIO_BUTTON_YES));
        return this;
    }
    @Step("Activate 'Yes' radio button")
    public RadioButtonPage activateYesRadioBtn(){
        $(YES_RADIO_BTN_TITLE).click();
        $(YES_RADIO_BTN).shouldBe(selected);
        $(RESULT_TITLE).shouldBe(visible);
        assertTrue(RESULT_TITLE.getText().contains(SELECTED_RESULT_TEXT));
        assertTrue(RESULT_TITLE.getText().contains(RADIO_BUTTON_YES));
        return this;
    }
    @Step("Check 'Impressive' radio button title")
    public RadioButtonPage checkImpressiveRadioBtn(){
        $(IMPRESSIVE_RADIO_BTN_TITLE).shouldBe(visible);
        assertTrue(IMPRESSIVE_RADIO_BTN_TITLE.getText().contains(RADIO_BUTTON_IMPRESS));
        return this;
    }
    @Step("Activate 'Impressive' radio button")
    public RadioButtonPage activateImpressiveRadioBtn(){
        $(IMPRESSIVE_RADIO_BTN_TITLE).click();
        $(IMPRESSIVE_RADIO_BTN).shouldBe(selected);
        $(RESULT_TITLE).shouldBe(visible);
        assertTrue(RESULT_TITLE.getText().contains(SELECTED_RESULT_TEXT));
        assertTrue(RESULT_TITLE.getText().contains(RADIO_BUTTON_IMPRESS));
        return this;
    }
    @Step("Check 'No' radio button title")
    public RadioButtonPage checkNoRadioBtn(){
        $(NO_RADIO_BTN_TITLE).shouldBe(visible);
        assertTrue(NO_RADIO_BTN_TITLE.getText().contains(RADIO_BUTTON_NO));
        return this;
    }
    @Step("Check that user can`t activate 'No' radio button")
    public RadioButtonPage activateNoRadioBtn(){
        $(NO_RADIO_BTN_TITLE).click();
        $(NO_RADIO_BTN).shouldNotBe(selected);
        return this;
    }
}