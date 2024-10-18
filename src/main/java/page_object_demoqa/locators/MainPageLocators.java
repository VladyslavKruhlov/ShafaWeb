package page_object_demoqa.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageLocators {
    public static final SelenideElement ELEMENTS = $x("//*[@class='card-body' and h5[text()='Elements']]");
    public static final SelenideElement FORMS = $("");
}