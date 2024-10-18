package page_object_shafa.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageLocators {
    public static final SelenideElement LOGO_BUTTON = $x("//*[@class='CPYSdYrBWQZEdODPocFO']");
    public static final SelenideElement SIGN_IN_BUTTON = $x("//*[@href='/uk/login' and text()='Вхід']");
    public static final SelenideElement POPUP_CLOSE_BUTTON = $x("//button[@class='vFhB6yaBSu_LOrFZyXUr elUm1FXWrtyJt0afwHkk TNsjRrGOBadpDFSQi7qn']");
}