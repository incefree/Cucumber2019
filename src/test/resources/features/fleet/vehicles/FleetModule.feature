Feature: As a truck driver I should be able to access Vehicle under Fleet module
  @vytrackVehicle
  Scenario: Truck driver access vehicle information

    Given  User on the Vytrack login page
    When  Enter truck driver user name and password
    And  Navigate to vehicle page
    Then  The truck driver should be able to see all vehicle information