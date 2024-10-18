package page_object_shafa.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPageLocators {
    public static final SelenideElement LOGIN_FIELD = $x("//*[@class='XVTi12K1x5WssFNE5gFg' and @placeholder='Введіть логін']");
    public static final SelenideElement PASSWORD_FIELD = $x("//*[@class='XVTi12K1x5WssFNE5gFg NI5S8pSGsAuz0B42qE_0' and @placeholder='Введіть пароль']");
    public static final SelenideElement LOGIN_BUTTON = $x("//button[text()='Увійти']");
    public static final SelenideElement UNSUCCESSFUL_LOGIN_MESSAGE = $x("//*[@class='DRODQheXzoiWvgU2fx3W']");
}