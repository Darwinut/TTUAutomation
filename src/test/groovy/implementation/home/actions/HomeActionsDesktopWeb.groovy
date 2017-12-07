package implementation.home.actions


import implementation.home.pages.HomePage
import io.cify.framework.actions.ActionsDesktopWeb
import io.cify.framework.core.Device

class HomeActionsDesktopWeb implements IHomeActions, ActionsDesktopWeb{
    Device device
    HomePage accountlandingPage

    HomeActionsDesktopWeb(Device device) {
        this.device = device
        this.accountlandingPage = new HomePage(device)
    }

    /**
     * Verifies if account landing page is visible
     * @return
     */
    @Override
    boolean isHomePageVisible() {
        return isDisplayed(accountlandingPage.getAccountName())
    }

    @Override
    void clickSidebarHeader(){
        click(accountlandingPage.getSidebarHeader())
    }

    @Override
    void clickLogout(){
        click(accountlandingPage.getLogout())
    }

    @Override
    void clickMyAccount(){
        click(accountlandingPage.getMyAccount())
    }

    @Override
    void clickGeneralChannel(){
        click(accountlandingPage.getGeneralChannel())
    }

    @Override
    void enterMessage(String message) {
        sendKeys(accountlandingPage.getMessageBox(), message)
    }

    @Override
    void clickSend(){
        click(accountlandingPage.getSendButton())
    }
}
