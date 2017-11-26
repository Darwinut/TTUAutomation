Feature: creating new account and login

  Background: User opens valid host name on browser
    Given user opens BROWSER application
    When user opens "https://open.rocket.chat" url
    Then login view should be visible

  @browser
  Scenario: User creates new account
    When user clicks on register a new account
    And user enters "darwinn" as name
    And user enters unique email
    And user enters "darwinn" as password
    And user enters "darwinn" as confirm password
    And user clicks register a new account button
    Then new user account should be created

  @browser
  Scenario: User logins with correct information on browser
    And user enters "darwinn" into username field
    When user enters "darwinn" into Password field
    Then user clicks Login button
    And login landing page should be visible