package Stepdef;

import Constants.FeatureNameConstants;
import Constants.LogConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.Textbox;
import util.UtilFactory;

import java.io.IOException;
import java.util.List;

public class Textboxstepdef extends PageObject {

    private static Logger logger = LoggerFactory.getLogger(Textboxstepdef.class);



    public WebDriver driver;
    Textbox textbox;

    UtilFactory utilFactory;

    public Textboxstepdef() {
        driver = super.getDriver();
        new UtilFactory(driver);
    }

    @Given("User is on Elements")
    public void user_is_on_elements() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        logger.info("User is on Elements");
        textbox.openUrl();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @When("User fill the data")
    public void user_fill_the_data(List<List<String>> TestboxCredential) throws IOException, ParseException {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        textbox.enterData(utilFactory.readJSON(FeatureNameConstants.TEXTBOX,TestboxCredential.get(0).get(0),"fullname",
                        "Textbox.json"),
                utilFactory.readJSON(FeatureNameConstants.TEXTBOX,TestboxCredential.get(0).get(0),"email",
                        "Textbox.json"),
                utilFactory.readJSON(FeatureNameConstants.TEXTBOX,TestboxCredential.get(0).get(0),"currentaddress",
                        "Textbox.json"),
                 utilFactory.readJSON(FeatureNameConstants.TEXTBOX,TestboxCredential.get(0).get(0),"paramentaddress",
                        "Textbox.json"));
        }
    @When("User clicks on submit button")
    public void user_clicks_on_submit_button() {

    }

    @Then("User should be fill data  Successfully")
    public void user_should_be_fill_data_successfully() {

    }


}

