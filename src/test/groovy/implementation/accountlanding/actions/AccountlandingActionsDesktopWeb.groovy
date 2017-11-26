package implementation.accountlanding.actions


import implementation.accountlanding.pages.AccountlandingPage
import io.cify.framework.actions.ActionsDesktopWeb
import io.cify.framework.core.Device

class AccountlandingActionsDesktopWeb implements IAccountlandingActions, ActionsDesktopWeb{
    Device device
    AccountlandingPage accountlandingPage

    AccountlandingActionsDesktopWeb(Device device) {
        this.device = device
        this.accountlandingPage = new AccountlandingPage(device)
    }

    /**
     * Verifies if account landing page is visible
     * @return
     */
    @Override
    boolean isAccountlandingPageVisible() {
        return isDisplayed(accountlandingPage.getAccountname())
    }
}
