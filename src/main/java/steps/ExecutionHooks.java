package steps;

import com.thoughtworks.gauge.AfterSpec;
import com.thoughtworks.gauge.BeforeSpec;
import com.thoughtworks.gauge.Step;
import driver_manager.DriverManager;

public class ExecutionHooks {

    @BeforeSpec
    public void startWebDriver() {
        DriverManager.startWebDriver();
    }

    @AfterSpec
    public void shutDownDriver() {
        DriverManager.shutDownDriver();
    }
}
