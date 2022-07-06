Feature: verfiy different GET operation using REST-ASSURED

@Smoke
  Scenario: Verfiy one student of the POST api
    Given perform GET operation for "/POST"
    And perform GET for id = 1
    Then Should see the student name as "Shruti Goyal"
@Smoke
  Scenario: Verfiy all student of the POST api
    Given perform GET operation for all the student "/POST"
    Then Should see the all student name
    Then Should get status code "200"