package page_object_demoqa.pages.elements;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static page_object_demoqa.ConstantsDemoqa.*;
import static page_object_demoqa.locators.elements.ButtonsPageLocators.*;

public class ButtonsPage {
    @Step("Check buttons url")
    public ButtonsPage checkButtonsUrl(){
        assertEquals(WebDriverRunner.url(), DEMOQA_BASE_URL+DEMOQA_ELEMENTS_BUTTONS);
        assertEquals($(BUTTONS_TITLE).getText(), TITLE_OF_BUTTONS);
        return this;
    }

    @Step("Click to Click Me button")
    public ButtonsPage clickClickMeBtn(){
        CLICK_ME_BUTTON.shouldBe(visible).shouldBe(clickable);
        assertTrue(CLICK_ME_BUTTON.getText().contains(BUTTON_CLICK_ME));
        CLICK_ME_BUTTON.click();
        return this;
    }
    @Step("Check message after Click Me button")
    public ButtonsPage checkMessageClickMe(){
        MESSAGE_AFTER_CLICK_ME_BTN.shouldBe(visible);
        assertTrue(MESSAGE_AFTER_CLICK_ME_BTN.getText().contains(BUTTON_CLICK_ME_MESSAGE));
        return this;
    }

    @Step("Click to Right button")
    public ButtonsPage clickRightBtn(){
        RIGHT_CLICK_BUTTON.shouldBe(visible).shouldBe(clickable);
        assertTrue(RIGHT_CLICK_BUTTON.getText().contains(BUTTON_RIGHT_CLICK));
        RIGHT_CLICK_BUTTON.contextClick();
        return this;
    }

    @Step("Check message after Right click button")
    public ButtonsPage checkMessageRightClick(){
        MESSAGE_AFTER_RIGHT_BTN.shouldBe(visible);
        assertTrue(MESSAGE_AFTER_RIGHT_BTN.getText().contains(BUTTON_RIGHT_CLICK_MESSAGE));
        return this;
    }

    @Step("Click to Double click button")
    public ButtonsPage clickDoubleClickBtn(){
        DOUBLE_CLICK_BUTTON.shouldBe(visible).shouldBe(clickable);
        assertTrue(DOUBLE_CLICK_BUTTON.getText().contains(BUTTON_DOUBLE_CLICK));
        DOUBLE_CLICK_BUTTON.doubleClick();
        return this;
    }

    @Step("Check message after Double click button")
    public ButtonsPage checkMessageDoubleClick(){
        MESSAGE_AFTER_DOUBLE_CLICK_BTN.shouldBe(visible);
        assertTrue(MESSAGE_AFTER_DOUBLE_CLICK_BTN.getText().contains(BUTTON_DOUBLE_CLICK_MESSAGE));
        return this;
    }
}