Feature: Swag Labs credential logics

  @New
  Scenario: Verified user can enter email and password
    Given user goes to the Swag labs Login Page
    Given User goes to the Sign Up Page
    And user clicks on login link
    When user enters email and password for verified users
    | standard_user | secret_sauce
    Then  user should not see any error