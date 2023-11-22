Feature: Register Functionality

  Scenario Outline: Sign Up as an User
    Given Navigate to ParaBank Website
    When Click on Register button
    And Enter "<FirstName>"as firstName and "<LastName>" as lastName and "<Adress>" as adress "<City>" as city "<State>" as state "<ZipCode>" as zipCode "<Phone>" as PhoneNumber "<SSN>" as ssn "<Username>" as username "<Password>" as password "<ConfirmPassword>" as confirmpassword
    And Click Register Button
    Then Assert you successfully login
    Examples: Data for Sign Up Informations
      | FirstName | LastName | Adress      | City     | State   | ZipCode | Phone        | SSN          | Username    | Password  | ConfirmPassword |
      | Ozgur     | X        | Bagdat Cad. | Istanbul | Maltepe | 34843   | 123123123123 | 123123123123 | ozgurTest22 | Qwerty!123 | Qwerty!123      |