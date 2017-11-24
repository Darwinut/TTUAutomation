package implementation.account.pages

import io.cify.framework.PageObjects
import io.cify.framework.core.Device
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class AccountPage extends PageObjects{

    @FindBy(className = "enable-notifications")
    WebElement enableDesktopNotifications

    AccountPage(Device device) {
        super(device)
    }
}
