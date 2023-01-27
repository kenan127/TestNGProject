package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.TechproLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_TechproLoginTest {

    @Test
    public void loginTest(){

        Driver.getDriver().get(ConfigReader.getProperty("techpro_test_url"));

        TechproLoginPage testcenterTechproeducation = new TechproLoginPage();
        testcenterTechproeducation.username.sendKeys(ConfigReader.getProperty("techpro_test_username"));
        testcenterTechproeducation.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
        testcenterTechproeducation.submitButton.click();

        assert Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("techpro_test_url"));

        //Driver.closeDriver();
    }



}
