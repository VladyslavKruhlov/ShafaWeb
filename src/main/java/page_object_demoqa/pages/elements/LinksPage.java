package page_object_demoqa.pages.elements;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.testng.Assert.assertEquals;
import static page_object_demoqa.ConstantsDemoqa.*;
import static page_object_demoqa.locators.elements.LinksPageLocators.*;

public class LinksPage {
    @Step("Check Links page")
    public LinksPage checkLinksPage(){
        assertEquals(WebDriverRunner.url(), DEMOQA_BASE_URL+DEMOQA_ELEMENTS_LINKS);
        LINKS_MAIN_TITLE.shouldBe(visible);
        assertEquals($(LINKS_MAIN_TITLE).getText(), LINKS_TITLE);
        ALL_LINKS.forEach(link->link.shouldNotBe(empty));
        assertEquals(ALL_LINKS.shouldHave().size(), 9);
        FOLLOWING_LINKS_WILL_OPEN.shouldBe(visible);
        FOLLOWING_LINKS_WITH_API_CALL.shouldBe(visible);
        return this;
    }
    @Step("Click Created link")
    public LinksPage clickCreatedLink(){
        CREATED_LINK.shouldBe(visible);
        CREATED_LINK.click();
        return this;
    }
    @Step("Check Created link response message")
    public LinksPage checkCreatedLinkResponse(){
        LINK_RESPONSE_MESSAGE.shouldBe(visible)
                .shouldHave(text(RESPONSE_MESSAGE_FOR_CREATED_LINK));
        return this;
    }
    @Step("Click No Content link")
    public LinksPage clickNoContentLink(){
        NO_CREATED_LINK.shouldBe(visible);
        NO_CREATED_LINK.click();
        return this;
    }
    @Step("Check Created link response message")
    public LinksPage checkNoContentLinkResponse(){
        LINK_RESPONSE_MESSAGE.shouldBe(visible)
                .shouldHave(text(RESPONSE_MESSAGE_FOR_NO_CONTENT_LINK));
        return this;
    }
    @Step("Click Moved link")
    public LinksPage clickMovedLink(){
        MOVED_LINK.shouldBe(visible);
        MOVED_LINK.click();
        return this;
    }
    @Step("Check Moved link response message")
    public LinksPage checkMovedLinkResponse(){
        LINK_RESPONSE_MESSAGE.shouldBe(visible)
                .shouldHave(text(RESPONSE_MESSAGE_FOR_MOVED_LINK));
        return this;
    }
    @Step("Click Bad Request link")
    public LinksPage clickBadRequestLink(){
        BAD_REQUEST_LINK.shouldBe(visible);
        BAD_REQUEST_LINK.click();
        return this;
    }
    @Step("Check Bad Request link response message")
    public LinksPage checkBadRequestLinkResponse(){
        LINK_RESPONSE_MESSAGE.shouldBe(visible)
                .shouldHave(text(RESPONSE_MESSAGE_FOR_BAD_REQUEST_LINK));
        return this;
    }
    @Step("Click Unauthorized link")
    public LinksPage clickUnauthorizedLink(){
        UNAUTHORIZED_LINK.shouldBe(visible);
        UNAUTHORIZED_LINK.click();
        return this;
    }
    @Step("Check Unauthorized link response message")
    public LinksPage checkUnauthorizedLinkResponse(){
        LINK_RESPONSE_MESSAGE.shouldBe(visible)
                .shouldHave(text(RESPONSE_MESSAGE_FOR_UNAUTHORIZED_LINK));
        return this;
    }
    @Step("Click Forbidden link")
    public LinksPage clickForbiddenLink(){
        FORBIDDEN_LINK.shouldBe(visible);
        FORBIDDEN_LINK.click();
        return this;
    }
    @Step("Check Forbidden link response message")
    public LinksPage checkForbiddenLinkResponse(){
        LINK_RESPONSE_MESSAGE.shouldBe(visible)
                .shouldHave(text(RESPONSE_MESSAGE_FOR_FORBIDDEN_LINK));
        return this;
    }
    @Step("Click Not Found link")
    public LinksPage clickNotFoundLink(){
        NOT_FOUND_LINK.shouldBe(visible);
        NOT_FOUND_LINK.click();
        return this;
    }
    @Step("Check NotFound link response message")
    public LinksPage checkNotFoundLinkResponse(){
        LINK_RESPONSE_MESSAGE.shouldBe(visible)
                .shouldHave(text(RESPONSE_MESSAGE_FOR_NOT_FOUND_LINK));
        return this;
    }
    @Step("Click Home link")
    public LinksPage clickHomeLink(){
        HOME_LINK.shouldBe(visible);
        HOME_LINK.click();
        return this;
    }
    @Step("Check Redirect to the Home Page")
    public LinksPage checkRedirectionToHomePage(){
        switchTo().window(1);
        assertEquals(WebDriverRunner.url(), DEMOQA_BASE_URL);
        return this;
    }
}