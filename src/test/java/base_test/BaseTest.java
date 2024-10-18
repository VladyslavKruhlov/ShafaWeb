package base_test;

import driver_manager.Browsers;
import driver_manager.SetUp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp(){
        SetUp.setUp(Browsers.CHROME);
    }

    @AfterMethod
    public void tearDown(){
        SetUp.close();
    }
}