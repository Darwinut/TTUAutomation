Feature: Hostname

  @android
  Scenario: User enters invalid hostname on android
    Given user opens ANDROID application
    Then hostname view should be visible
    When user enters "https://open.rocket.chat" into hostname
    And user clicks on select button
    Then login view should be visible

  @iOS
  Scenario: User enters valid hostname on iOS
    Given user opens IOS application
    Then hostname view should be visible
    When user enters "https://open.rocket.chat" into hostname
    And user clicks on select button
    Then login view should be visible

  @browser
  Scenario: User opens valid host name on browser
    Given user opens BROWSER application
    When user opens "https://open.rocket.chat" url
    Then login view should be visible

  @browser
  Scenario: User logins with correct information on browser
    Given user opens BROWSER application
    When user opens "https://open.rocket.chat" url
    Then login view should be visible
    And user enters "darwinn" into username field
    When user enters "darwinn" into Password field
    Then user clicks Login button

  @browser
  Scenario: Enable desktop notifications on browser
    Given user opens BROWSER application
    When user opens "https://open.rocket.chat" url
    Then login view should be visible
    And user enters "darwinn" into username field
    When user enters "darwinn" into Password field
    Then user clicks Login button
    When user opens "https://open.rocket.chat/account/preferences" url
    Then user clicks on enable desktop notification button