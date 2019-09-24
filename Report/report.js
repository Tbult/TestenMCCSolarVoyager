$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testcases.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# cucumber feature file written in Gherkin"
    }
  ],
  "line": 4,
  "name": "View website with placeholders",
  "description": "",
  "id": "view-website-with-placeholders",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Succesful view the website with placeholders",
  "description": "",
  "id": "view-website-with-placeholders;succesful-view-the-website-with-placeholders",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on web page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User sees a table and two graphs",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User close web page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_is_on_web_page()"
});
formatter.result({
  "duration": 8435429100,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_sees_a_table_and_two_graphs()"
});
formatter.result({
  "duration": 175778600,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_close_web_page()"
});
formatter.result({
  "duration": 693102700,
  "status": "passed"
});
});