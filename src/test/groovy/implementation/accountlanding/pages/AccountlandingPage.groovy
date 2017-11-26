package implementation.accountlanding.pages

import io.cify.framework.PageObjects
import io.cify.framework.core.Device
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class AccountlandingPage extends PageObjects{

    @FindBy(className = "sidebar__account-username")
    WebElement accountname

    AccountlandingPage(Device device) {
        super(device)
    }
}