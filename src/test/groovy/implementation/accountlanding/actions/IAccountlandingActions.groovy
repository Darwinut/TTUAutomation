package implementation.accountlanding.actions

interface IAccountlandingActions {

    /**
     * Verifies if account landing page is visible
     * @return
     */
    boolean isAccountlandingPageVisible()

    /**
     * Click sidebar header
     */
    void clickSidebarHeader()

    /**
     * Click logout
     */
    void clickLogout()

    /**
     * Click my account
     */
    void clickMyAccount()
}