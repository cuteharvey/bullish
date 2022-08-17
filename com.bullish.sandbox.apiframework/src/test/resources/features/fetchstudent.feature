Feature: Fetch Student


  Scenario: Fetch Student
    Given the student record is retrieved
    Then the status code 200 is returned
    Then verify the following fields exist
      | id | firstName | lastName  | studentClass | nationality           |
