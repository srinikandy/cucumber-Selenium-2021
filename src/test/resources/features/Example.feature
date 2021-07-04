Feature: This is demo feature file

  @Scenario1
  Scenario Outline: Test scenario
    When user navigate to the "googleURL" url
    Then user is on the "GoogleSearch" page
    And user verify field is displayed
      |WebElement|
      |search    |
      |search |
      |search  |
#    And user enters following data
#      |WeBElement|Value|
#      |firstName |Srinivasa|
#      |lastName  | Kandula |
#
    And user enters "<keyWord>" in the "search" text box
    And user takes screenshot as "googleSearch_<row>"
    And user click on the "searchButton" button
    Then user is on the "GoogleSearchResults" page
    And user wait until "results" are visible
    And user verify "results" displayed


    Examples:
    |keyWord| row|
    |Selenium|1  |
    |cucumber|2  |
