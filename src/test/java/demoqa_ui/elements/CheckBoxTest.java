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

public class CheckBoxTest extends BaseTest {
    @Test(groups="Check Box")
    @Owner("v.kruhlov")
    @Description("Check show button, hide button and main folder")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkShowAndHideButtons() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToCheckBox()
                .checkCheckBoxUrl()
                .checkCheckBoxPageMainElements()
                .clickToShowAllCheckboxes()
                .clickToHideAllCheckboxes();
    }

    @Test(groups="Check Box")
    @Owner("v.kruhlov")
    @Description("Select all checkboxes by Home checkbox")
    @Severity(SeverityLevel.NORMAL)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkSelectionOfAllCheckboxes() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToCheckBox()
                .clickToShowAllCheckboxes()
                .clickToHomeCheckbox()
                .checkResultSectionWhenAllSelected();
    }

    @Test(groups="Check Box")
    @Owner("v.kruhlov")
    @Description("Open folder tree and select Office/General checkbox")
    @Severity(SeverityLevel.NORMAL)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkSelectionOfOneCheckbox() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToCheckBox()
                .goToGeneralCheckbox()
                .clickToGeneralCheckbox()
                .checkResultSectionWhenOneSelected();
    }
}