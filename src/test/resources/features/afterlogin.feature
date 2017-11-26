Feature: actions after login


  Background: User logs in with existing account information
    Given user opens BROWSER application
    When user opens "https://open.rocket.chat" url
    Then login view should be visible
    And user enters "darwinn" into username field
    When user enters "darwinn" into Password field
    Then user clicks Login button
    And login landing page should be visible

  @browser
  Scenario: Enable desktop notifications on browser
    When user opens "https://open.rocket.chat/account/preferences" url
    Then user clicks on enable desktop notification button