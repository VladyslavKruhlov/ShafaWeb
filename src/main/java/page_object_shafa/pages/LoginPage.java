package page_object_shafa.pages;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import page_object_shafa.locators.LoginPageLocators;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;
import static page_object_shafa.Constants.*;

public class LoginPage {
    @Step("Check that login page opened")
    public LoginPage checkLoginPage(){
        assertEquals(WebDriverRunner.url(), SHAFA_LOGIN_PAGE_URL);
        return this;
    }

    @Step("Enter Login")
    public LoginPage enterLogin(String login){
        $(LoginPageLocators.LOGIN_FIELD).shouldBe(visible);
        $(LoginPageLocators.LOGIN_FIELD).sendKeys(login);
        return this;
    }

    @Step("Enter Password")
    public LoginPage enterPassword(String password){
        $(LoginPageLocators.PASSWORD_FIELD).shouldBe(visible);
        $(LoginPageLocators.PASSWORD_FIELD).sendKeys(password);
        return this;
    }

    @Step("Enter Login button")
    public MainPage clickLoginButton(){
        $(LoginPageLocators.LOGIN_BUTTON).shouldBe(visible);
        assertTrue($(LoginPageLocators.LOGIN_BUTTON).getText().contains(LOGIN_BUTTON_TEXT));
        $(LoginPageLocators.LOGIN_BUTTON).click();
        return new MainPage();
    }

    @Step("Enter Login button")
    public LoginPage clickLoginButtonWithError(){
        $(LoginPageLocators.LOGIN_BUTTON).shouldBe(visible);
        assertTrue($(LoginPageLocators.LOGIN_BUTTON).getText().contains(LOGIN_BUTTON_TEXT));
        $(LoginPageLocators.LOGIN_BUTTON).click();
        return this;
    }

    @Step("Check unsuccessful login message")
    public LoginPage checkUnsuccessfulLogin(){
        $(LoginPageLocators.UNSUCCESSFUL_LOGIN_MESSAGE).shouldBe(visible);
        assertTrue($(LoginPageLocators.UNSUCCESSFUL_LOGIN_MESSAGE).getText().contains(LOGIN_ERROR));
        return this;
    }
}