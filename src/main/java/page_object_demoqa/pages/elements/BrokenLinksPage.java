package page_object_demoqa.pages.elements;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;
import static page_object_demoqa.ConstantsDemoqa.*;

public class BrokenLinksPage {
    @Step("Check Broken Links page")
    public BrokenLinksPage checkElementsMainPage(){
        assertEquals(WebDriverRunner.url(), DEMOQA_ELEMENTS_URL+DEMOQA_ELEMENTS_BROKEN_LINKS);
        $(BROKEN_LINKS_TITLE).shouldBe(visible).shouldHave(text(BROKEN_LINKS_TITLE));
        return this;
    }
}