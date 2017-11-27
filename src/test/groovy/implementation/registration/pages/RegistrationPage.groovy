package implementation.registration.pages

import io.cify.framework.PageObjects
import io.cify.framework.core.Device
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class RegistrationPage extends PageObjects {


    @FindBy(id = "name")
    WebElement nameField

    @FindBy(id = "email")
    WebElement email

    @FindBy(id = "pass")
    WebElement pass

    @FindBy(id = "confirm-pass")
    WebElement confirmpassword

    @FindBy(css = "button.button.primary.login")
    WebElement registerAccountButton

    RegistrationPage(Device device) {
        super(device)
    }
}
