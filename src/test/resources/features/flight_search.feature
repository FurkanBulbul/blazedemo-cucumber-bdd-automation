Feature: Flight Booking End-to-End Functionality

  Scenario: User should be able to book a flight successfully
    Given User is on the BlazeDemo home page
    When User selects departure city "Paris"
    And User selects destination city "London"
    And User clicks on the "Find Flights" button
    Then User should see available flights
    When User chooses the first available flight
    Then User should be on the purchase page
    When User fills in passenger details "Ahmet Yilmaz" and "123 Main St" and "Istanbul"
    And User enters credit card "1234567890123456" and "11" and "2028" and "Ahmet Yilmaz"
    And User clicks Purchase Flight button
    Then User should see the booking confirmation page