package implementation.accountlanding.pages

import io.cify.framework.PageObjects
import io.cify.framework.core.Device
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class AccountlandingPage extends PageObjects{

    @FindBy(className = "sidebar__account-username")
    WebElement accountName

    @FindBy(css = "div.sidebar__account.active")
    WebElement sidebarHeader

    @FindBy(xpath = "//span[contains(text(), 'Logout')]")
    WebElement logout

    @FindBy(xpath = "//span[contains(text(), 'My Account')]")
    WebElement myAccount

    AccountlandingPage(Device device) {
        super(device)
    }
}