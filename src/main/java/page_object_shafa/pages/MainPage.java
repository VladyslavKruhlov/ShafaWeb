package page_object_shafa.pages;

import io.qameta.allure.Step;
import page_object_shafa.locators.MainPageLocators;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.*;
import static page_object_shafa.Constants.*;

public class MainPage {

    @Step("Click Logo")
    public MainPage clickLogo(){
        $(MainPageLocators.LOGO_BUTTON).shouldBe(visible);
        $(MainPageLocators.LOGO_BUTTON).click();
        return this;
    }

    @Step("Click signIn button")
    public LoginPage clickSignInButton(){
        $(MainPageLocators.SIGN_IN_BUTTON).shouldBe(visible);
        assertTrue($(MainPageLocators.SIGN_IN_BUTTON).getText().contains(SIGN_IN_BUTTON_TEXT));
        $(MainPageLocators.SIGN_IN_BUTTON).click();
        return new LoginPage();
    }

    @Step("Check signIn button after login")
    public MainPage checkSignInButtonAfterLogin(){
        $(MainPageLocators.SIGN_IN_BUTTON).shouldNotBe(visible);
        return this;
    }

    @Step ("Close popup install app")
    public MainPage closePopupInstallApp(){
        $(MainPageLocators.POPUP_CLOSE_BUTTON).shouldBe(visible);
        $(MainPageLocators.POPUP_CLOSE_BUTTON).click();
        return this;
    }
}