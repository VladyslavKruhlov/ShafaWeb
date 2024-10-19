package demoqa_ui.elements;

import base_test.BaseTest;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page_object_demoqa.pages.MainPage;

import static common.CommonMethods.openPage;
import static page_object_demoqa.ConstantsDemoqa.DEMOQA_BASE_URL;

public class ButtonsTest extends BaseTest {
    @Test(groups="Buttons")
    @Owner("v.kruhlov")
    @Description("Check Click Me button")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkButtonClickMe() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToButtons()
                .checkButtonsUrl()
                .clickClickMeBtn()
                .checkMessageClickMe();
    }

    @Test(groups="Buttons")
    @Owner("v.kruhlov")
    @Description("Check Right click button")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkButtonRightClick() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToButtons()
                .checkButtonsUrl()
                .clickRightBtn()
                .checkMessageRightClick();
    }

    @Test(groups="Buttons")
    @Owner("v.kruhlov")
    @Description("Check Double click button")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkButtons() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToButtons()
                .checkButtonsUrl()
                .clickDoubleClickBtn()
                .checkMessageDoubleClick();
    }

    @Test(groups="Buttons")
    @Owner("v.kruhlov")
    @Description("Check all buttons and all messages")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void clickAllButtons() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToButtons()
                .checkButtonsUrl()
                .clickDoubleClickBtn()
                .checkMessageDoubleClick()
                .clickRightBtn()
                .checkMessageRightClick()
                .clickClickMeBtn()
                .checkMessageClickMe();
    }
}