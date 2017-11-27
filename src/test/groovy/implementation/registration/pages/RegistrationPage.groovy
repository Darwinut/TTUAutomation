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
    WebElement confirmPassword

    @FindBy(xpath = "//span[contains(text(), 'Register a new account')]")
    WebElement registerAccountButton

    @FindBy(id = "username")
    WebElement username

    @FindBy(xpath = "//span[contains(text(), 'Use this username')]")
    WebElement useThisUsernameButton

    RegistrationPage(Device device) {
        super(device)
    }
}
