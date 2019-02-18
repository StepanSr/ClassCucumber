$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/amazon1.feature");
formatter.feature({
  "name": "Amazon search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@some"
    }
  ]
});
formatter.scenario({
  "name": "Amazon search test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@some"
    },
    {
      "name": "@amazon_search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_steps.user_is_on_the_amazon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters headphones keyword",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_steps.user_enters_headphones_keyword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to search btn",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon_steps.user_click_to_search_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see headphones in result",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_steps.user_should_see_headphones_in_result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/wiki.feature");
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