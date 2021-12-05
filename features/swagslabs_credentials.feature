@Smoke
  Feature: Swag labs login Functionality

    Background:
      Given User goes to the Swag Labs login page

      @Fish
      Scenario: User can login to Trello with valid credentials
        When user is on Login Page
        And user logins to the Swag Labs with valid credentials
        Then User should be able to see Swag Labs product page


      @Dev
      Scenario: User cannot login to Trello with invalid credentials
        When User is on Login Page
        And user Logins with invalid credentials
        Then user should be able to see an error message

