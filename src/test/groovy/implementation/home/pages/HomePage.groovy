package implementation.home.pages

import io.cify.framework.PageObjects
import io.cify.framework.core.Device
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class HomePage extends PageObjects{

    @FindBy(className = "sidebar__account-username")
    WebElement accountName

    @FindBy(css = "div.sidebar__account.active")
    WebElement sidebarHeader

    @FindBy(xpath = "//span[contains(text(), 'Logout')]")
    WebElement logout

    @FindBy(xpath = "//span[contains(text(), 'My Account')]")
    WebElement myAccount

    @FindBy(xpath = "//div[contains(text(), 'general')]")
    WebElement generalChannel

    @FindBy(className = "rc-message-box__container")
    WebElement messageBox

    @FindBy(css = "svg.rc-icon.rc-input__icon-svg.rc-input__icon-svg--send")
    WebElement sendButton

    HomePage(Device device) {
        super(device)
    }
}