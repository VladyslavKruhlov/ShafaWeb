package page_object_demoqa.locators.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BrokenLinksPageLocators {
    public static final SelenideElement BROKEN_LINKS_TITLE = $x("//h1[@class='text-center']");
}