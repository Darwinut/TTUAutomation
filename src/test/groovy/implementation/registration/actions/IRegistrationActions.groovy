package implementation.registration.actions

interface IRegistrationActions {

    /**
     * Enter name to field
     * @param name
     */
    void enterName(String name)

    /**
     * Enter email to field
     * @param email
     */
    void enterEmail(String email)

    /**
     * Enter password to field
     * @param password
     */
    void enterPassword(String password)

    /**
     * Enter confirm password to field
     * @param confirm password
     */
    void enterConfirmPassword(String confirmpassword)

    /**
     * Click register button
     */
    void clickRegister()

}