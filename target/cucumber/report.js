$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/weekDays.feature");
formatter.feature({
  "name": "Week Days",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@days"
    }
  ]
});
formatter.scenario({
  "name": "check weekdays",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@days"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open browser go to \"http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BTN.open_browser_go_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Randomly select days of the week.",
  "keyword": "Then "
});
formatter.match({
  "location": "BTN.randomly_select_days_of_the_week()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print the name of the day and uncheck immediately.",
  "keyword": "And "
});
formatter.match({
  "location": "BTN.print_the_name_of_the_day_and_uncheck_immediately()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});