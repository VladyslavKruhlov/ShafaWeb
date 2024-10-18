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
import static page_object_demoqa.ConstantsDemoqa.*;

public class TextBoxTest extends BaseTest {
    @Test(groups="Text Box")
    @Owner("v.kruhlov")
    @Description("Check Text Box")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkTextBox(){
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .checkElementsMainPage()
                .clickToTextBox()
                .checkTextBoxUrl()
                .checkFullNameFieldTitle()
                .enterFullName()
                .checkEmailFieldTitle()
                .enterEmail()
                .checkCurrentAddressFieldTitle()
                .enterCurrentAddress()
                .checkPermanentAddressFieldTitle()
                .enterPermanentAddress()
                .clickSubmitButton()
                .checkUserData();
    }
}