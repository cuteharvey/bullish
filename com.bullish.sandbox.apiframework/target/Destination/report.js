$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fetchstudent.feature");
formatter.feature({
  "line": 1,
  "name": "Fetch Student",
  "description": "",
  "id": "fetch-student",
  "keyword": "Feature"
});
formatter.before({
  "duration": 861793392,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Fetch Student",
  "description": "",
  "id": "fetch-student;fetch-student",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the student record is retrieved",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the status code 200 is returned",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "verify the following fields exist",
  "rows": [
    {
      "cells": [
        "id",
        "firstName",
        "lastName",
        "studentClass",
        "nationality"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "FetchStudentSteps.the_student_record_is_retrieved()"
});
formatter.result({
  "duration": 1305037636,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 16
    }
  ],
  "location": "FetchStudentSteps.the_status_code_is_returned(int)"
});
formatter.result({
  "duration": 5114104,
  "status": "passed"
});
formatter.match({
  "location": "FetchStudentSteps.verify_the_following_fields_exist(String\u003e)"
});
formatter.result({
  "duration": 39516887,
  "status": "passed"
});
});