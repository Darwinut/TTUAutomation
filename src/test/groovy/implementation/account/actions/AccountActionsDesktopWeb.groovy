package implementation.account.actions

import implementation.account.pages.AccountPage
import io.cify.framework.actions.ActionsDesktopWeb
import io.cify.framework.core.Device


class AccountActionsDesktopWeb implements IAccountActions, ActionsDesktopWeb {

    Device device
    AccountPage accountPage

    AccountActionsDesktopWeb(Device device) {
        this.device = device
        this.accountPage = new AccountPage(device)
    }

    /**
     * Click enable desktop notifications button
     */
    void enableDesktopNotifications() {
        click(accountPage.getEnableDesktopNotifications())
    }
}
