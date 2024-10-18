package shafa_tests;

import base_test.BaseTest;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page_object_shafa.pages.MainPage;

import static page_object_shafa.Constants.*;
import static common.CommonMethods.openPage;

public class Login extends BaseTest {

    @Test(groups="Shafa Login")
    @Owner("v.kruhlov")
    @Description("Successful login")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="ShafaWeb", url = SHAFA_BASE_URL)
    public void successfulLoginFromMainPage(){
        openPage(SHAFA_BASE_URL);
        new MainPage()
                .clickLogo()
                .clickSignInButton()
                .checkLoginPage()
                .enterLogin(LOGIN)
                .enterPassword(PASSWORD)
                .clickLoginButton()
                .checkSignInButtonAfterLogin();
    }

    @Test(groups="Shafa Login")
    @Owner("v.kruhlov")
    @Description("Unsuccessful login with incorrect login")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name ="ShafaWeb", url = SHAFA_BASE_URL)
    public void unsuccessfulLogin(){
        openPage(SHAFA_BASE_URL);
        new MainPage()
                .clickLogo()
                .clickSignInButton()
                .checkLoginPage()
                .enterLogin(INCORRECT_LOGIN)
                .enterPassword(PASSWORD)
                .clickLoginButtonWithError()
                .checkUnsuccessfulLogin();
    }

    @Test(groups="Shafa Login")
    @Owner("v.kruhlov")
    @Description("Unsuccessful login with incorrect password")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name ="ShafaWeb", url = SHAFA_BASE_URL)
    public void unsuccessfulLoginWithoutCredentials(){
        openPage(SHAFA_BASE_URL);
        new MainPage()
                .clickLogo()
                .clickSignInButton()
                .checkLoginPage()
                .enterLogin(LOGIN)
                .enterPassword(INCORRECT_PASSWORD)
                .clickLoginButtonWithError()
                .checkUnsuccessfulLogin();
    }
}