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

public class RadioButtonText extends BaseTest {
    @Test(groups="Radio Button")
    @Owner("v.kruhlov")
    @Description("Check yes, no, impressive radio buttons")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkRadioButtons() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToRadioButton()
                .checkRadioButtonUrl()
                .checkEmptyResultField()
                .checkYesRadioBtn()
                .activateYesRadioBtn()
                .checkImpressiveRadioBtn()
                .activateImpressiveRadioBtn()
                .checkNoRadioBtn()
                .activateNoRadioBtn();
    }
}