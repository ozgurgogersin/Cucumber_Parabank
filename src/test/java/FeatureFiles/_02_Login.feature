Feature: Login Functionality

  Scenario Outline: Test Login functionality by using valid and invalid test data
    Given Navigate to ParaBank Website
    And Enter "<userName>" as username and "<passWord>" as password
    And Click on Log in button
    Then Assert all attempts

    Examples:
      | userName    | passWord   |
      | ozgurTest22 | 7#9P!kLmN  |
      | SilverF1$H  | Qwerty!12  |
      | GreenM0nk3y | Y$5p@JkL#9 |
      |             | Qwerty!12  |
      | ozgurTest22 |            |
      |             |            |
      | ozgurTest22 | Qwerty!123 |

