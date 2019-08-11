$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/fleet/vehicles/FleetModule.feature");
formatter.feature({
  "name": "As a truck driver I should be able to access Vehicle under Fleet module",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Truck driver access vehicle information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@vytrackVehicle"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the Vytrack login page",
  "keyword": "Given "
});
formatter.match({
  "location": "FleetVehicleStepDefinitions.user_on_the_Vytrack_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter truck driver user name and password",
  "keyword": "When "
});
formatter.match({
  "location": "FleetVehicleStepDefinitions.enter_truck_driver_user_name_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to vehicle page",
  "keyword": "And "
});
formatter.match({
  "location": "FleetVehicleStepDefinitions.navigate_to_vehicle_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The truck driver should be able to see all vehicle information",
  "keyword": "Then "
});
formatter.match({
  "location": "FleetVehicleStepDefinitions.the_truck_driver_should_be_able_to_see_all_vehicle_information()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});