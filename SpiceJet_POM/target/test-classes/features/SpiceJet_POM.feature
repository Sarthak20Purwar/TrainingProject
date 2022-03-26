Feature: Spice Jet Booking Ticket Functionality

  Scenario Outline: Check details with valid credentials
    Given browser is open
    And user is on spiceJet homepage
    When user enters the text box of from city
    And user selects the city from
    And user selects the city to
    Then user selects the departure date
    When user clicks the return date option
    And user enters the return date
    Then user clicks the search flight button
    Then user clicks the continue button
    
    
    
    When User enters the First name text box
    And User enters the last name
    Then User enters the mobile number
    And User enters the email address
    And User enters the city
    
    Then User Enters the First name in second text box
    And User enters the last name in the second box
    And User enters the mobile number in second text box
    Then User click the continue button
    
    
    And User enters the Add button  
    Then User clicks the seat number   
    And User clicks the select meal  
    And User selects the meal
    Then User enters the done button 
    #And User clickss the continue button  
    #Then user checks the amount
