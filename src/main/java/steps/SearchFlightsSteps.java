package steps;

import com.thoughtworks.gauge.Step;
import driver_manager.DriverManager;
import driver_manager.DriverSteps;
import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchFlightsSteps {

    @Step("Select departure city <city>")
    public void selectDeparture(String city) {
        DriverSteps driverSteps = new DriverSteps();
        Select departureSelect = new Select(driverSteps.findElement(By.cssSelector("select[name='fromPort']")));
        departureSelect.selectByValue(city);
    }

    @Step("Select destination city <city>")
    public void selectDestination(String city) {
        DriverSteps driverSteps = new DriverSteps();
        Select destinationSelect = new Select(driverSteps.findElement(By.cssSelector("select[name='toPort']")));
        destinationSelect.selectByValue(city);
    }

    @Step("Search for flights")
    public void searchFlights() {
        DriverSteps driverSteps = new DriverSteps();
        driverSteps.findElement(By.cssSelector("input[type='submit']")).click();
    }

    @Step("There are flights found")
    public void flightsFound() {
        DriverSteps driverSteps = new DriverSteps();
        List<WebElement> elements = driverSteps.findElements(By.cssSelector("table tr"));
        Assert.assertNotNull(elements);
        DriverManager.goToHomePage();
    }
}
