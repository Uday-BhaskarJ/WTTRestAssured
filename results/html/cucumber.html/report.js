$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/studentApiFeature.feature");
formatter.feature({
  "line": 1,
  "name": "verfiy different GET operation using REST-ASSURED",
  "description": "",
  "id": "verfiy-different-get-operation-using-rest-assured",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verfiy one student of the POST api",
  "description": "",
  "id": "verfiy-different-get-operation-using-rest-assured;verfiy-one-student-of-the-post-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "perform GET operation for \"/POST\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "perform GET for id \u003d 1",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Should see the student name as \"Shruti Goyal\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 7,
  "name": "Verfiy all student of the POST api",
  "description": "",
  "id": "verfiy-different-get-operation-using-rest-assured;verfiy-all-student-of-the-post-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "perform GET operation for all the student \"/POST\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Should see the all student name",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Should get status code \"200\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});