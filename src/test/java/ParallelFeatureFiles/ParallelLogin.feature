Feature: Login Functionality with parallel

  Scenario Outline: Test Login functionality with different browsers using valid test data
    Given Navigate to ParaBank Website with "<browser>"
    And Enter "<userName>" as username and "<passWord>" as password
    And Click on Log in button
    Then Assert all attempts

    Examples:
      | browser | userName    | passWord   |
      | chrome  | ozgurTest22 | Qwerty!123 |
      | firefox | ozgurTest22 | Qwerty!123 |
      | edge    | ozgurTest22 | Qwerty!123 |
