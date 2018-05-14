package driver_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DriverSteps {

   private WebDriverWait driverWait;

   public DriverSteps() {
       driverWait = new WebDriverWait(DriverManager.getWebDriver(), 10);
   }

   public WebElement findElement(By by) {
      return driverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
   }

   public List<WebElement> findElements(By by) {
       return driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
   }
}
