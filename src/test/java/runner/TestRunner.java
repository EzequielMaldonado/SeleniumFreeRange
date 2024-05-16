package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", // Directorio de nuestros archivos .feature
                glue = "steps", // Paquete donde tenemos nuestras clases definiendo los steps
                plugin = { "pretty", "html:target/cucumber-reports" }, tags = "@Papa")

public class TestRunner {
        @BeforeClass
        public static void maximizar() {
                BasePage.maximizar();
        }

        @AfterClass
        public static void cleanDriver() {
                BasePage.closeBrowser();
        }

        // Testing the git functions
}