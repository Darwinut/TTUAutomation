package implementation

import implementation.account.actions.IAccountActions
import implementation.home.actions.IHomeActions
import implementation.core.actions.ICoreActions
import implementation.hostname.actions.IHostnameActions
import implementation.login.actions.ILoginActions
import implementation.registration.actions.IRegistrationActions
import io.cify.framework.Actions
import io.cify.framework.core.Device
import io.cify.framework.core.DeviceManager

/**
 * Created by FOB Solutions
 */
class ActionsImpl {

    private static final String IMPLEMENTATION_PACKAGE = "implementation."

    /**
     * Gets core actions for current device
     * @return
     */
    static ICoreActions getCoreActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice()
        return (ICoreActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "core.actions.CoreActions")
    }

    /**
     * Get Hostname actions for current device
     * @return
     */
    static IHostnameActions getHostActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice()
        return (IHostnameActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "hostname.actions.HostnameActions")
    }

    /**
     * Get login actions for current device
     * @return
     */
    static ILoginActions getLoginActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice()
        return (ILoginActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "login.actions.LoginActions")
    }

    /**
     * Get account actions for current device
     * @return
     */
    static IAccountActions getAccountActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice()
        return (IAccountActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "account.actions.AccountActions")
    }

    /**
     * Get account actions for current device
     * @return
     */
    static IHomeActions getHomeActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice()
        return (IHomeActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "home.actions.HomeActions")
    }

    /**
     * Get Registration page actions for current device
     * @return
     */
    static IRegistrationActions getRegistrationActions() {
        Device currentDevice = DeviceManager.getInstance().getActiveDevice()
        return (IRegistrationActions) Actions.getCustomActions(currentDevice, IMPLEMENTATION_PACKAGE + "registration.actions.RegistrationActions")
    }
}
