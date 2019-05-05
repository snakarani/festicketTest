Feature: LogIn and LogOut
  @LogIn
  Scenario: As a user I should be able to log in successfully
    Given I am on HomePage of festicket.com
    When I click on LogIn button
    And Enter valid Email address and Passeword
    And click on LogIn
    Then I should be able to LogIn successfully and User details should display on UserProfile menu

  @LogOut
    Scenario: As a register user I should be able to LogOut successfully
      Given I have logged in successfully
      When I click on user profile button
      And click on Log Out button
      Then I should Log out successfully and nevigate to homepage