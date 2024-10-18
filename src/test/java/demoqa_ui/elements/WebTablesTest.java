package demoqa_ui.elements;

import base_test.BaseTest;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import page_object_demoqa.pages.MainPage;

import static common.CommonMethods.openPage;
import static page_object_demoqa.ConstantsDemoqa.*;

public class WebTablesTest extends BaseTest {
    @Test(groups="Web Tables")
    @Owner("v.kruhlov")
    @Description("Add a new row to the Web table")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void addTable() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToWebTables()
                .checkWebTablesUrl()
                .clickToAddButton()
                .checkRegistrationForm()
                .enterFirstName(NAME)
                .enterLastName(SURNAME)
                .enterEmail(EMAIL)
                .enterAge(AGE)
                .enterSalary(SALARY)
                .enterDepartment(DEPARTMENT)
                .clickSubmitBtn()
                .checkNewTableRowData(NAME, SURNAME, EMAIL, AGE, SALARY, DEPARTMENT);
    }

    @Test(groups="Web Tables")
    @Owner("v.kruhlov")
    @Description("Close Registration form")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void closeRegistrationForm() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToWebTables()
                .checkWebTablesUrl()
                .clickToAddButton()
                .checkRegistrationForm()
                .clickCloseBtn()
                .checkClosedRegistrationForm();
    }

    @Test(groups="Web Tables")
    @Owner("v.kruhlov")
    @Description("Search a table")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void searchTable() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToWebTables()
                .checkWebTablesUrl()
                .searchTable(SEARCHING_NAME)
                .checkNewTableRowData(SEARCHING_NAME, SEARCHING_SURNAME, SEARCHING_EMAIL, SEARCHING_AGE, SEARCHING_DEPARTMENT, SEARCHING_SALARY);
    }

    @Test(groups="Web Tables")
    @Owner("v.kruhlov")
    @Description("Edit table")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void editTableData() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToWebTables()
                .checkWebTablesUrl()
                .searchTable(SEARCHING_NAME)
                .checkNewTableRowData(SEARCHING_NAME, SEARCHING_SURNAME, SEARCHING_EMAIL, SEARCHING_AGE, SEARCHING_DEPARTMENT, SEARCHING_SALARY)
                .clickEditBtn()
                .enterFirstName(NAME)
                .enterLastName(SURNAME)
                .enterEmail(EMAIL)
                .enterAge(AGE)
                .enterSalary(SALARY)
                .enterDepartment(DEPARTMENT)
                .clickSubmitBtn()
                .clearSearchField()
                .searchTable(NAME)
                .checkNewTableRowData(NAME, SURNAME, EMAIL, AGE, SALARY, DEPARTMENT);
    }

    @Test(groups="Web Tables")
    @Owner("v.kruhlov")
    @Description("Delete table")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void deleteTable() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToWebTables()
                .checkWebTablesUrl()
                .searchTable(SEARCHING_NAME)
                .clickDeleteBtn()
                .clearSearchField()
                .searchTable(SEARCHING_NAME)
                .checkDeletedTable();
    }

    @Test(groups="Web Tables")
    @Owner("v.kruhlov")
    @Description("Change table count")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name ="Demoqa", url = DEMOQA_BASE_URL)
    public void changeTableCount() {
        openPage(DEMOQA_BASE_URL);
        new MainPage()
                .clickToElements()
                .clickToWebTables()
                .checkWebTablesUrl()
                .changeTableCountToMax()
                .changeTableCountToMin();
    }
}