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

public class Searching extends BaseTest {
    @Test(groups="Shafa")
    @Owner("v.kruhlov")
    @Description("Search item with search field")
    @Severity(SeverityLevel.NORMAL)
    @Link(name ="ShafaWeb", url = SHAFA_BASE_URL)
    public void searchItemWithSearchingField(){
        openPage(SHAFA_BASE_URL);
        new MainPage()
                .clickLogo();
    }

    @Test(groups="Shafa")
    @Owner("v.kruhlov")
    @Description("Search item by catalog")
    @Severity(SeverityLevel.NORMAL)
    @Link(name ="ShafaWeb", url = SHAFA_BASE_URL)
    public void searchItemByCatalog(){
        openPage(SHAFA_BASE_URL);
        new MainPage()
                .clickLogo();
    }

    @Test(groups="Shafa")
    @Owner("v.kruhlov")
    @Description("Search item by collection")
    @Severity(SeverityLevel.NORMAL)
    @Link(name ="ShafaWeb", url = SHAFA_BASE_URL)
    public void searchItemByCollection(){
        openPage(SHAFA_BASE_URL);
        new MainPage()
                .clickLogo();
    }
}