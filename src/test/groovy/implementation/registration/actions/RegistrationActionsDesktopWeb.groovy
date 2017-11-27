package implementation.registration.actions

import implementation.registration.pages.RegistrationPage
import io.cify.framework.actions.ActionsDesktopWeb
import io.cify.framework.core.Device

class RegistrationActionsDesktopWeb implements IRegistrationActions, ActionsDesktopWeb {

    Device device
    RegistrationPage registrationPage

    RegistrationActionsDesktopWeb(Device device) {
        this.device = device
        this.registrationPage = new RegistrationPage(device)
    }

    @Override
    void enterName(String name) {
        sendKeys(registrationPage.getNameField(), name)
    }

    @Override
    void enterEmail(String email) {
        sendKeys(registrationPage.getEmail(), email)
    }

    @Override
    void enterPassword(String password) {
        sendKeys(registrationPage.getPass(), password)
    }

    @Override
    void enterConfirmPassword(String confirmpassword) {
        sendKeys(registrationPage.getConfirmPassword(), confirmpassword)
    }

    @Override
    void clickRegister() {
        click(registrationPage.getRegisterAccountButton())
    }

    @Override
    void enterUniqueUsername() {
        click(registrationPage.getUsername())
    }

    @Override
    void clickUseThisUsername() {
        click(registrationPage.getUseThisUsernameButton())
    }
}
