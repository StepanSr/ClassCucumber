$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wiki.feature");
formatter.feature({
  "name": "Wikipedia search feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@some"
    }
  ]
});
formatter.scenario({
  "name": "Wikipedia search test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@some"
    },
    {
      "name": "@wiki"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the wicipedia homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wiki_steps.user_is_on_the_wicipedia_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter Stive Jobs to search bar and click enter",
  "keyword": "When "
});
formatter.match({
  "location": "Wiki_steps.user_enter_Stive_Jobs_to_search_bar_and_click_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sould see the first header is displaing steve jobs",
  "keyword": "Then "
});
formatter.match({
  "location": "Wiki_steps.user_sould_see_the_first_header_is_displaing_steve_jobs()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});