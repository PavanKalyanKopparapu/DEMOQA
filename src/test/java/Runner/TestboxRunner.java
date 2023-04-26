package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(plugin = {}, features = "C:\\Users\\Pavan.Kopparapu\\Downloads\\RegestrationLoginPage\\DEMOQA\\src\\test\\resources\\Feature\\Register\\Textbox.feature", glue = "StepDef")

    public class TestboxRunner {
    }

