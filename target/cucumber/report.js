$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/selctdd.feature");
formatter.feature({
  "name": "dd",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@mira"
    }
  ]
});
formatter.scenario({
  "name": "ckeck dd",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mira"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "go to",
  "keyword": "Given "
});
formatter.match({
  "location": "Mira.go_to()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ckek if selected",
  "keyword": "Then "
});
formatter.match({
  "location": "Mira.ckek_if_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});