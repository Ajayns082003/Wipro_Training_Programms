@smoke
Feature: Login functionality

  @smoke @positive
  Scenario Outline: Successful Login
    Given I open the browser and launch the login page
    When I login with username "<username>" and password "<password>"
    Then I should see the home page

    Examples: Successful Login
      | username | password |
      | Ajay     | aj123    |
      | Vinay    | vini123  |

  @regression @negative
  Scenario Outline: Failed login
    Given I open the browser and launch the login page
    When I login with username "<username>" and password "<password>"
    Then I should see an error message

    Examples: Failed login
      | username | password |
      | Ajay     | aj1      |
      | Vinay    | 122      |
