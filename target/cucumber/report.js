$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/test.feature");
formatter.feature({
  "name": "This is my first Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Google search scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to Google application",
  "keyword": "When "
});
formatter.match({
  "location": "Test_steps.user_goes_to_Google_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for apple",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_steps.user_searches_for_apple()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see apple related results",
  "keyword": "And "
});
formatter.match({
  "location": "Test_steps.user_should_see_apple_related_results()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});