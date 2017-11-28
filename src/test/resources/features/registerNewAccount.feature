Feature: creating new account and login

  Background: User opens valid host name on browser
    Given user opens BROWSER application
    When user opens "https://open.rocket.chat" url
    Then login view should be visible

  @browser
  Scenario: User creates new account with unique email and suggesting username
    When user clicks on register a new account
    And user enters "random" as name
    And user enters unique emailID as email
    And user enters "random" as password
    And user enters "random" as confirm password
    And user clicks register a new account button
    #And user enters "random-8993" username as name
    And use the suggesting username
    And login landing page should be visible

  @browser
  Scenario: User login with correct information on browser
    And user enters "darwinn" into username field
    When user enters "darwinn" into Password field
    Then user clicks Login button
    And login landing page should be visible