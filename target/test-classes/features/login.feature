
@web
  Feature: darksky main page

    Background:
      Given I am on main page

@main
      Scenario: Verify your main page
        When I enter lowest temperature on main page
        And I enter highest temperature on main page
        Then I verify weather forecast

