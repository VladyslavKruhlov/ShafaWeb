package page_object_demoqa.pages;

import io.qameta.allure.Step;
import page_object_demoqa.locators.MainPageLocators;
import page_object_demoqa.pages.elements.ElementsMainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class MainPage {
    @Step("Click to the Elements card")
    public ElementsMainPage clickToElements(){
        executeJavaScript("arguments[0].scrollIntoView(true);", $(MainPageLocators.ELEMENTS));
        $(MainPageLocators.ELEMENTS).shouldBe(visible);
        $(MainPageLocators.ELEMENTS).click();
        return new ElementsMainPage();
    }
}