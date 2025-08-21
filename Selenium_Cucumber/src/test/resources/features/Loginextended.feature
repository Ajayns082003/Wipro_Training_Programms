@auth @regression
Feature: Login Functionality
  As a user, I want to log in to the application
  So that I can access my account and perform actions

  Background:
    Given I open the browser
    And I navigate to the login page at "https://example.com/login"

  @positive @smoke
  Scenario: Successful login with valid credentials
    Given I am not logged in
    When I enter the username "sunil23" and password "hi123"
    And I click the login button
    Then I should be redirected to the home page
    And I should see a welcome message "Welcome, sunil!"
    But I should not see an error message

  @negative
  Scenario Outline: Failed login with invalid credentials
    Given I am not logged in
    When I enter the username "<username>" and password "<password>"
    And I click the login button
    Then I should see an error message "<error_message>"

    Examples:
      | username | password | error_message              |
      | AJAYN187 | hi19     | Invalid username or password |
      | ajayns   | 120      | Invalid username or password |

  @data-driven @positive
  Scenario Outline: Successful login with multiple valid users
    Given I am not logged in
    When I login with the following credentials:
      | username   | <username> |
      | password   | <password> |
    Then I should be redirected to the home page
    And I should see a welcome message "<welcome_message>"

    Examples:
      | username | password | welcome_message    |
      | sunil23  | hi123    | Welcome, sunil!    |
      | pardee1  | 1234     | Welcome, pradee!   |

  @edge-case
  Scenario: Login with empty credentials
    Given I am not logged in
    When I submit the login form with empty fields
    Then I should see an error message in the following format:
      """
      Error: Username and password are required.
      Please fill in all fields and try again.
      """
    But I should not be redirected to the home page

  @security
  Scenario: Login attempt with locked account
    Given the user "locked_user" has a locked account
    When I enter the username "locked_user" and password "pass123"
    And I click the login button
    Then I should see an error message:
    
      """
      Your account is locked.
      Please contact support at support@example.com.
      """

