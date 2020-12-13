@fb
Feature:  As a strange user should not allow to login to fb

  @test1
  Scenario: Strange user should not allow to login to FB-1
    Given I have launched FB login page
    When I enter username is "testUser"
    And I enter password is "testPassword"
    And I click on login button
    Then I should see error message


  @test2
  Scenario: Strange user should not allow to login to FB-2
    Given I have launched FB login page
    And I enter credentials
      | username | password     |
      | testUser | testPassword |
    And I click on login button
    Then I should see error message

  @test3
  Scenario Outline: Strange user should not allow to login to FB-3
    Given I have launched FB login page
    When I enter username is <username>
    And I enter password is <password>
    And I click on login button
    Then I should see error message
    Examples:
      | username   | password       |
      | testUser   | testPassword   |
      | testUser-1 | testPassword-1 |
      | testUser-2 | testPassword-2 |