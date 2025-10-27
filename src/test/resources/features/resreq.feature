Feature: Validate ReqRes users APIs return 200

  Background:
    Given url baseUrl

  @resreq
  Scenario: GET /users returns 200
    And path 'users'
    When method get
    Then status 200

  @resreq
  Scenario: GET /users/1 returns 200
    And path 'users', 1
    When method get
    Then status 200

  @resreq
  Scenario: GET /users/2 returns 200
    And path 'users', 2
    When method get
    Then status 200

