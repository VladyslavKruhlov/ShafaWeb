package page_object_demoqa.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import page_object_demoqa.locators.elements.TextBoxPageLocators;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static org.testng.Assert.assertEquals;
import static page_object_demoqa.ConstantsDemoqa.*;

public class TextBoxPage {
    @Step("Check text box url")
    public TextBoxPage checkTextBoxUrl(){
        assertEquals(WebDriverRunner.url(), DEMOQA_ELEMENTS_TEXT_BOX_URL);
        assertEquals($(TextBoxPageLocators.TEXT_BOX_TITLE).getText(), TITLE_TEXT_BOX);
        return this;
    }
    @Step("Check full name field title")
    public TextBoxPage checkFullNameFieldTitle(){
        $(TextBoxPageLocators.FULL_NAME_FIELD_TITLE).shouldBe(visible);
        assertEquals($(TextBoxPageLocators.FULL_NAME_FIELD_TITLE).getText(), TITLE_FULL_NAME_FIELD);
        return this;
    }
    @Step("Enter full name")
    public TextBoxPage enterFullName(){
        $(TextBoxPageLocators.FULL_NAME_FIELD).shouldBe(visible);
        $(TextBoxPageLocators.FULL_NAME_FIELD).shouldBe(clickable);
        $(TextBoxPageLocators.FULL_NAME_FIELD).sendKeys(FULL_NAME);
        return this;
    }
    @Step("Check email field title")
    public TextBoxPage checkEmailFieldTitle(){
        $(TextBoxPageLocators.EMAIL_FIELD_TITLE).shouldBe(visible);
        assertEquals($(TextBoxPageLocators.EMAIL_FIELD_TITLE).getText(), TITLE_EMAIL_FIELD);
        return this;
    }
    @Step("Enter email")
    public TextBoxPage enterEmail(){
        $(TextBoxPageLocators.EMAIL_FIELD).shouldBe(visible);
        $(TextBoxPageLocators.EMAIL_FIELD).shouldBe(clickable);
        $(TextBoxPageLocators.EMAIL_FIELD).sendKeys(EMAIL);
        return this;
    }
    @Step("Check current address field title")
    public TextBoxPage checkCurrentAddressFieldTitle(){
        $(TextBoxPageLocators.CURRENT_ADDRESS_FIELD_TITLE).shouldBe(visible);
        assertEquals($(TextBoxPageLocators.CURRENT_ADDRESS_FIELD_TITLE).getText(), TITLE_CURRENT_ADDRESS_FIELD);
        return this;
    }
    @Step("Enter current address")
    public TextBoxPage enterCurrentAddress(){
        $(TextBoxPageLocators.CURRENT_ADDRESS_FIELD).shouldBe(visible);
        $(TextBoxPageLocators.CURRENT_ADDRESS_FIELD).shouldBe(clickable);
        $(TextBoxPageLocators.CURRENT_ADDRESS_FIELD).sendKeys(ADDRESS);
        return this;
    }
    @Step("Check permanent address field title")
    public TextBoxPage checkPermanentAddressFieldTitle(){
        $(TextBoxPageLocators.PERMANENT_ADDRESS_FIELD_TITLE).shouldBe(visible);
        assertEquals($(TextBoxPageLocators.PERMANENT_ADDRESS_FIELD_TITLE).getText(), TITLE_PERMANENT_ADDRESS_FIELD);
        return this;
    }
    @Step("Enter permanent address")
    public TextBoxPage enterPermanentAddress(){
        $(TextBoxPageLocators.PERMANENT_ADDRESS_FIELD).shouldBe(visible);
        $(TextBoxPageLocators.PERMANENT_ADDRESS_FIELD).shouldBe(clickable);
        $(TextBoxPageLocators.PERMANENT_ADDRESS_FIELD).sendKeys(ADDRESS);
        return this;
    }
    @Step("Click submit button")
    public TextBoxPage clickSubmitButton(){
        executeJavaScript("arguments[0].scrollIntoView(true);", $(TextBoxPageLocators.SUBMIT_BUTTON));
        $(TextBoxPageLocators.SUBMIT_BUTTON).shouldBe(visible);
        $(TextBoxPageLocators.SUBMIT_BUTTON).shouldBe(clickable);
        assertEquals($(TextBoxPageLocators.SUBMIT_BUTTON).getText(), SUBMIT_BUTTON_NAME);
        $(TextBoxPageLocators.SUBMIT_BUTTON).click();
        return this;
    }
    @Step("Check total user data after user submit filed fields")
    public TextBoxPage checkUserData(){
        $(TextBoxPageLocators.TOTAL_INFO_FIELD).shouldBe(visible);
        $(TextBoxPageLocators.TOTAL_INFO_FIELD).shouldNotBe(empty);
        $(TextBoxPageLocators.TOTAL_INFO_FIELD).shouldHave(Condition
                        .text("Name:"+FULL_NAME+
                                "\nEmail:"+EMAIL+
                                "\nCurrent Address :"+ADDRESS+
                                "\nPermananet Address :"+ADDRESS));
        return this;
    }
}