package page_object_demoqa;

public class ConstantsDemoqa {

    // LINKS
    public static final String DEMOQA_BASE_URL = "https://demoqa.com/";
    public static final String DEMOQA_ELEMENTS_URL = "https://demoqa.com/elements";
    public static final String DEMOQA_ELEMENTS_TEXT_BOX_URL = "https://demoqa.com/text-box";
    public static final String DEMOQA_ELEMENTS_CHECK_BOX_URL = "https://demoqa.com/checkbox";
    public static final String DEMOQA_ELEMENTS_RADIO_BUTTON_URL = "radio-button";
    public static final String DEMOQA_ELEMENTS_WEB_TABLE_URL = "webtables";
    public static final String DEMOQA_ELEMENTS_BUTTONS = "buttons";
    public static final String DEMOQA_ELEMENTS_LINKS = "links";
    public static final String DEMOQA_ELEMENTS_BROKEN_LINKS = "broken";
    public static final String DEMOQA_FORM_URL = "https://demoqa.com/forms";
    public static final String DEMOQA_ALERTS_URL = "https://demoqa.com/alertsWindows";
    public static final String DEMOQA_WIDGETS_URL = "https://demoqa.com/widgets";
    public static final String DEMOQA_INTERACTIONS_URL = "https://demoqa.com/interaction";
    public static final String DEMOQA_BOOK_STORE_URL = "https://demoqa.com/books";

    // CREDENTIALS
    public static final String NAME = "Vladyslav";
    public static final String SURNAME = "Kruhlov";
    public static final String FULL_NAME = "Vladyslav Kruhlov";
    public static final String EMAIL = "mr.kruglov@gmail.com";
    public static final String PHONE = "0661261129";
    public static final String ADDRESS = "Kiev, st.Kievskaya 78a, ap.7";
    public static final String AGE = "30";
    public static final String DEPARTMENT = "IT";
    public static final String SALARY = "3000";

    // ELEMENTS TEXT BOX TEXT
    public static final String TITLE_TEXT_BOX = "Text Box";
    public static final String TITLE_FULL_NAME_FIELD = "Full Name";
    public static final String TITLE_EMAIL_FIELD = "Email";
    public static final String TITLE_CURRENT_ADDRESS_FIELD = "Current Address";
    public static final String TITLE_PERMANENT_ADDRESS_FIELD= "Permanent Address";
    public static final String SUBMIT_BUTTON_NAME = "Submit";

    // ELEMENTS CHECK BOX TEXT
    public static final String TITLE_CHECK_BOX = "Check Box";
    public static final String SELECTED_CHECKBOXES_RESULT_TEXT = "You have selected :";
    public static final String SELECTED_DOWNLOADS_WORD_FOLDER_RESULT = "wordFile";
    public static final String SELECTED_DOCUMENTS_OFFICE_FOLDER_RESULT = "general";

    // ELEMENTS RADIO BUTTON
    public static final String TITLE_RADIO_BUTTON = "Radio Button";
    public static final String TITLE_OF_QUESTION = "Do you like the site?";
    public static final String RADIO_BUTTON_YES = "Yes";
    public static final String RADIO_BUTTON_NO = "No";
    public static final String RADIO_BUTTON_IMPRESS = "Impressive";
    public static final String SELECTED_RESULT_TEXT = "You have selected";

    // ELEMENTS WEB TABLES
    public static final String WEB_TABLES_TITLE = "Web Tables";
    public static final String SEARCHING_NAME = "Alden";
    public static final String SEARCHING_SURNAME = "Cantrell";
    public static final String SEARCHING_EMAIL = "alden@example.com";
    public static final String SEARCHING_AGE = "45";
    public static final String SEARCHING_DEPARTMENT = "Compliance";
    public static final String SEARCHING_SALARY = "12000";

    // ELEMENTS BUTTONS
    public static final String TITLE_OF_BUTTONS = "Buttons";
    public static final String BUTTON_CLICK_ME = "Click Me";
    public static final String BUTTON_DOUBLE_CLICK = "Double Click Me";
    public static final String BUTTON_RIGHT_CLICK = "Right Click Me";
    public static final String BUTTON_CLICK_ME_MESSAGE = "You have done a dynamic click";
    public static final String BUTTON_DOUBLE_CLICK_MESSAGE = "You have done a double click";
    public static final String BUTTON_RIGHT_CLICK_MESSAGE = "You have done a right click";

    // LINKS
    public static final String LINKS_TITLE = "Links";
    public static final String RESPONSE_MESSAGE_FOR_CREATED_LINK = "Link has responded with staus 201 and status text Created";
    public static final String RESPONSE_MESSAGE_FOR_NO_CONTENT_LINK = "Link has responded with staus 204 and status text No Content";
    public static final String RESPONSE_MESSAGE_FOR_MOVED_LINK = "Link has responded with staus 301 and status text Moved Permanently";
    public static final String RESPONSE_MESSAGE_FOR_BAD_REQUEST_LINK = "Link has responded with staus 400 and status text Bad Request";
    public static final String RESPONSE_MESSAGE_FOR_UNAUTHORIZED_LINK = "Link has responded with staus 401 and status text Unauthorized";
    public static final String RESPONSE_MESSAGE_FOR_FORBIDDEN_LINK = "Link has responded with staus 403 and status text Forbidden";
    public static final String RESPONSE_MESSAGE_FOR_NOT_FOUND_LINK = "Link has responded with staus 404 and status text Not Found";

    // LINKS
    public static final String BROKEN_LINKS_TITLE = "Broken Links - Images";
}
//document.evaluate("//*[@type='button' and text()='Click Me']", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();
//document.querySelector('#addNewRecordButton').click();
//document.evaluate(
//    "XPathExpression", // Ваш XPath-запрос
//    document,          // Контекст, в котором ищется XPath (здесь весь документ)
//    null,              // Namespace resolver, используется для работы с XML с пространствами имен (обычно null для HTML-документов)
//    XPathResult.FIRST_ORDERED_NODE_TYPE, // Тип результата, который мы хотим получить (первый найденный узел)
//    null               // Начальная точка запроса; null означает начать с начала документа
//)
