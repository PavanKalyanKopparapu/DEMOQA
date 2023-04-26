package ui;

import Constants.LogConstants;
import Constants.URLConstants;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.Locators.TextboxLocators;
import util.UtilFactory;

public class Textbox extends PageObject {
    private static Logger logger = LoggerFactory.getLogger(Textbox.class);

    @Managed
    public WebDriver driver;
    Textbox textbox;
    private UtilFactory utilFactory;

    public Textbox() {
        driver = super.getDriver();
        utilFactory = new UtilFactory(driver);

    }

    @FindBy(xpath = TextboxLocators.Elements)
    private WebElement element;

    @FindBy(xpath = TextboxLocators.Textbox)
    private WebElement teXtbox;

    @FindBy(xpath = TextboxLocators.FullName)
    private WebElement Fullname;

    @FindBy(xpath = TextboxLocators.Email)
    private WebElement emaiL;

    @FindBy(xpath = TextboxLocators.CurrentAddress)
    private WebElement currentAddress;

    @FindBy(xpath = TextboxLocators.PermanentAddress)
    private WebElement permanentAddress;

    @FindBy(xpath = TextboxLocators.Submit)
    private WebElement submit;


    public void openUrl() {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        logger.info(URLConstants.setUrl());
        super.openUrl(URLConstants.setUrl());
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void enterData(String fullname, String email, String currentaddress, String paramentaddress) {
        logger.debug(LogConstants.LOG_ENTER + Thread.currentThread().getStackTrace()[1].getMethodName());
        utilFactory.highlight(teXtbox);
        teXtbox.click();
        utilFactory.highlight(Fullname);
        Fullname.click();
        Fullname.sendKeys(fullname);
        utilFactory.highlight(emaiL);
        emaiL.click();
        emaiL.sendKeys(email);
        utilFactory.highlight(currentAddress);
        currentAddress.click();
        currentAddress.sendKeys(currentaddress);
        utilFactory.highlight(permanentAddress);
        permanentAddress.click();
        permanentAddress.sendKeys(paramentaddress);
        utilFactory.highlight(submit);
        submit.click();
        logger.debug(LogConstants.LOG_EXIT + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}


