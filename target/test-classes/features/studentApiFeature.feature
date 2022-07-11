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
@Smoke
  Scenario: Verfiy Get parameter
    Given perform GET operation for all the student "/POST"
    Then Should see the Get parameter
    Then Should see the query param
@Smoke
  Scenario: Post api using pojo class
    Given perform POST operation for "/POST"
    Then Should post one student details
@Smoke
  Scenario: Delete one student info
    Given perform delete operation for "/POST"
    Then Should delete one student details

