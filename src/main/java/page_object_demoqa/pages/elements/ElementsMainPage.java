package page_object_demoqa.pages.elements;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import page_object_demoqa.locators.elements.ElementsMainPageLocators;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.testng.Assert.*;
import static page_object_demoqa.ConstantsDemoqa.*;

public class ElementsMainPage {
    @Step("Check element page")
    public ElementsMainPage checkElementsMainPage(){
        assertEquals(WebDriverRunner.url(), DEMOQA_ELEMENTS_URL);
        $(ElementsMainPageLocators.OPTION_LIST).shouldBe(visible);
        return this;
    }
    @Step("Click to the Text Box")
    public TextBoxPage clickToTextBox(){
        $(ElementsMainPageLocators.TEXT_BOX_OPTION).shouldBe(visible);
        $(ElementsMainPageLocators.TEXT_BOX_OPTION).click();
        return new TextBoxPage();
    }
    @Step("Click to the Check Box")
    public CheckBoxPage clickToCheckBox(){
        $(ElementsMainPageLocators.CHECK_BOX_OPTION).shouldBe(visible);
        $(ElementsMainPageLocators.CHECK_BOX_OPTION).click();
        return new CheckBoxPage();
    }
    @Step("Click to the Radio button")
    public RadioButtonPage clickToRadioButton(){
        $(ElementsMainPageLocators.RADIO_BUTTON_OPTION).shouldBe(visible);
        $(ElementsMainPageLocators.RADIO_BUTTON_OPTION).click();
        return new RadioButtonPage();
    }
    @Step("Click to the Web Tables")
    public WebTablesPage clickToWebTables(){
        $(ElementsMainPageLocators.WEB_TABLES_OPTION).shouldBe(visible);
        $(ElementsMainPageLocators.WEB_TABLES_OPTION).click();
        return new WebTablesPage();
    }
    @Step("Click to the Buttons")
    public ButtonsPage clickToButtons(){
        $(ElementsMainPageLocators.BUTTONS_OPTION).shouldBe(visible);
        $(ElementsMainPageLocators.BUTTONS_OPTION).click();
        return new ButtonsPage();
    }
    @Step("Click to the Links")
    public LinksPage clickToLinks(){
        $(ElementsMainPageLocators.LINKS_OPTION).shouldBe(visible);
        $(ElementsMainPageLocators.LINKS_OPTION).click();
        return new LinksPage();
    }
    @Step("Click to the Broken Links")
    public LinksPage clickToBrokenLinks(){
        $(ElementsMainPageLocators.BROKEN_LINKS_OPTION).shouldBe(visible);
        $(ElementsMainPageLocators.BROKEN_LINKS_OPTION).click();
        return new LinksPage();
    }
}