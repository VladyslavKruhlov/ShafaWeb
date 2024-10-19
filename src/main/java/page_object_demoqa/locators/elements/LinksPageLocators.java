package page_object_demoqa.locators.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LinksPageLocators {
    public static final ElementsCollection ALL_LINKS = $$("#linkWrapper p");
    public static final SelenideElement LINKS_MAIN_TITLE = $x("//h1[@class='text-center']");
    public static final SelenideElement FOLLOWING_LINKS_WILL_OPEN = $x("//*[text()='Following links will open new tab']");
    public static final SelenideElement FOLLOWING_LINKS_WITH_API_CALL = $x("//*[text()='Following links will send an api call']");
    public static final SelenideElement HOME_LINK = $("#simpleLink");
    public static final SelenideElement CREATED_LINK = $("#created");
    public static final SelenideElement NO_CREATED_LINK = $("#no-content");
    public static final SelenideElement MOVED_LINK = $("#moved");
    public static final SelenideElement BAD_REQUEST_LINK = $("#bad-request");
    public static final SelenideElement UNAUTHORIZED_LINK = $("#unauthorized");
    public static final SelenideElement FORBIDDEN_LINK = $("#forbidden");
    public static final SelenideElement NOT_FOUND_LINK = $("#invalid-url");
    public static final SelenideElement LINK_RESPONSE_MESSAGE = $("#linkResponse");
}