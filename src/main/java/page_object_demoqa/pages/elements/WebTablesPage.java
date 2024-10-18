package page_object_demoqa.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static page_object_demoqa.ConstantsDemoqa.*;
import static page_object_demoqa.locators.elements.WebTablesPageLocators.*;

public class WebTablesPage {
    @Step("Check Web Tables url and title")
    public WebTablesPage checkWebTablesUrl(){
        assertEquals(DEMOQA_BASE_URL+DEMOQA_ELEMENTS_WEB_TABLE_URL, WebDriverRunner.url());
        $(PAGE_TITLE).shouldBe(visible);
        assertTrue(PAGE_TITLE.getText().contains(WEB_TABLES_TITLE));
        return this;
    }
    @Step("Click to Add button")
    public WebTablesPage clickToAddButton(){
        $(ADD_BUTTON.shouldBe(visible));
        $(ADD_BUTTON).click();
        return this;
    }
    @Step("Check Registration form")
    public WebTablesPage checkRegistrationForm(){
        REGISTRATION_IFRAME_TITLE.shouldBe(visible);
        return this;
    }
    @Step("Check closed Registration form")
    public WebTablesPage checkClosedRegistrationForm(){
        REGISTRATION_IFRAME_TITLE.shouldNotBe(visible);
        return this;
    }
    @Step("Enter First Name")
    public WebTablesPage enterFirstName(String name){
        $(FIRST_NAME_FIELD.shouldBe(visible));
        $(FIRST_NAME_FIELD).clear();
        $(FIRST_NAME_FIELD).sendKeys(name);
        return this;
    }
    @Step("Enter Last Name")
    public WebTablesPage enterLastName(String surname){
        $(LAST_NAME_FIELD.shouldBe(visible));
        $(LAST_NAME_FIELD).clear();
        $(LAST_NAME_FIELD).sendKeys(surname);
        return this;
    }
    @Step("Enter Email")
    public WebTablesPage enterEmail(String email){
        $(EMAIL_FIELD.shouldBe(visible));
        $(EMAIL_FIELD).clear();
        $(EMAIL_FIELD).sendKeys(email);
        return this;
    }
    @Step("Enter Age")
    public WebTablesPage enterAge(String age){
        $(AGE_FIELD.shouldBe(visible));
        $(AGE_FIELD).clear();
        $(AGE_FIELD).sendKeys(age);
        return this;
    }
    @Step("Enter Salary")
    public WebTablesPage enterSalary(String salary){
        $(SALARY_FIELD.shouldBe(visible));
        $(SALARY_FIELD).clear();
        $(SALARY_FIELD).sendKeys(salary);
        return this;
    }
    @Step("Enter Department")
    public WebTablesPage enterDepartment(String department){
        $(DEPARTMENT_FIELD.shouldBe(visible));
        $(DEPARTMENT_FIELD).clear();
        $(DEPARTMENT_FIELD).sendKeys(department);
        return this;
    }
    @Step("click to Submit")
    public WebTablesPage clickSubmitBtn(){
        $(SUBMIT_BTN.shouldBe(visible));
        $(SUBMIT_BTN).click();
        return this;
    }
    @Step("Check Table Row data")
    public WebTablesPage checkNewTableRowData(String name, String surname, String email, String age, String salary, String department){
        TABLE_LIST.forEach(row->row.shouldNotBe(empty));
        TABLE_LIST
                .findBy(Condition.text(name))
                .shouldHave(Condition.text(surname))
                .shouldHave(Condition.text(email))
                .shouldHave(Condition.text(age))
                .shouldHave(Condition.text(salary))
                .shouldHave(Condition.text(department));
        return this;
    }
    @Step("click to Close Registration form button")
    public WebTablesPage clickCloseBtn(){
        $(CLOSE_REGISTRATION_FORM_BTN.shouldBe(visible));
        $(CLOSE_REGISTRATION_FORM_BTN).click();
        return this;
    }
    @Step("Search a new row in the table")
    public WebTablesPage searchTable(String name){
        $(SEARCH_FIELD.shouldBe(visible));
        SEARCH_FIELD.clear();
        SEARCH_FIELD.sendKeys(name);
        return this;
    }
    @Step("Clear search field")
    public WebTablesPage clearSearchField(){
        $(SEARCH_FIELD.shouldBe(visible));
        SEARCH_FIELD.clear();
        return this;
    }
    @Step("Click to Edit button")
    public WebTablesPage clickEditBtn(){
        EDIT_BTN.shouldBe(visible);
        EDIT_BTN.click();
        REGISTRATION_IFRAME_TITLE.shouldBe(visible);
        return this;
    }
    @Step("Click to Delete button")
    public WebTablesPage clickDeleteBtn(){
        DELETE_BTN.shouldBe(visible);
        DELETE_BTN.click();
        return this;
    }
    @Step("Check Table Row data")
    public WebTablesPage checkDeletedTable(){
        TABLE_LIST.forEach(row->row.shouldBe(empty));
        return this;
    }
    @Step("Change count of table to min")
    public WebTablesPage changeTableCountToMin(){
        $(CHANGE_ROWS_COUNT_BTN).click();
        $(CHANGE_ROWS_COUNT_BTN).selectOption("5 rows");
        assertEquals(CHANGE_ROWS_COUNT_BTN.getSelectedOption().getText(), "5 rows");
        assertEquals(TABLE_ROW_LIST.shouldHave().size(), 5);
        return this;
    }
    @Step("Change count of table to max")
    public WebTablesPage changeTableCountToMax(){
        $(CHANGE_ROWS_COUNT_BTN).click();
        $(CHANGE_ROWS_COUNT_BTN).selectOption("25 rows");
        assertEquals(CHANGE_ROWS_COUNT_BTN.getSelectedOption().getText(), "25 rows");
        assertEquals(TABLE_ROW_LIST.shouldHave().size(), 25);
        executeJavaScript("arguments[0].scrollIntoView(true);", $(CHANGE_ROWS_COUNT_BTN));
        return this;
    }
}