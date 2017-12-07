package implementation.home.actions

interface IHomeActions {

    /**
     * Verifies if account landing page is visible
     * @return
     */
    boolean isHomePageVisible()

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

    /**
     * Click general channel
     */
    void clickGeneralChannel()

    /**
     * Enter welcome message
     * @param message
     */
    void enterMessage(String message)

    /**
     * Click send to send message
     */
    void clickSend()
}