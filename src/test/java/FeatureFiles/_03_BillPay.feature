Feature: Bill Pay Functionality

  Background:
    Given Navigate to ParaBank Website

  Scenario Outline: Get Login
    And Enter valid "<userName>" as username and valid "<passWord>" as password
    And Click on Log in button
    Then Assert you successfully login with valid credentials
    Examples:
      | userName    | passWord  |
      | ozgurTest22 | Qwerty!123 |

  Scenario Outline: Testing Bill Pay function
    Given Click on Bill Pay Link
    And Fill static information
      | 123 Main Street | 456 Elm Street | 789 Oak Street | 101 Pine Street |
      | New York        | Los Angeles    | Chicago        | Miami           |
      | NY              | CA             | IL             | FL              |
      | 10001           | 90001          | 60601          | 33101           |
      | (555) 123-4567  | (555) 987-6543 | (555) 555-5555 | (555) 111-8888  |
      | 9876543210      | 1234567890     | 5555555555     | 9999999999      |
      | 9876543210      | 1234567890     | 5555555555     | 9999999999      |

    And Enter "<PayeeName>" and  and "<Amount>"
    Then Click on send payment button
    Examples:
      | PayeeName        | Amount |
      | Electricity Bill | 85     |
      | Water Bill       | 45     |
      | Gas Bill         | 150    |
      | Internet Bill    | 60     |








