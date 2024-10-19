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

public class LinksTest extends BaseTest {
    @Test(groups="Links")
    @Owner("v.kruhlov")
    @Description("Check Created link")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkCreatedLink() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToLinks()
                .checkLinksPage()
                .clickCreatedLink()
                .checkCreatedLinkResponse()
                .clickNoContentLink()
                .checkNoContentLinkResponse()
                .clickMovedLink()
                .checkMovedLinkResponse()
                .clickBadRequestLink()
                .checkBadRequestLinkResponse()
                .clickUnauthorizedLink()
                .checkUnauthorizedLinkResponse()
                .clickForbiddenLink()
                .checkForbiddenLinkResponse()
                .clickNotFoundLink()
                .checkNotFoundLinkResponse();
    }

    @Test(groups="Links")
    @Owner("v.kruhlov")
    @Description("Check Home Link")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void checkHomeLink() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToLinks()
                .checkLinksPage()
                .clickHomeLink()
                .checkRedirectionToHomePage();
    }
}