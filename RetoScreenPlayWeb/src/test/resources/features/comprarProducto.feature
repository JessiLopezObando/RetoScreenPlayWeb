Feature: Buying a low-priced product on the Exito website
  As a user of the Exito website
  I want to buy a low-priced product
  To make a quick and easy online purchase

  @Login
  Scenario: Logging in to the Exito website
    Given that I am on the Exito website
    When I select the Mi cuenta option
    And provide my user credentials email and password
    Then I should see the message Hola indicating that the session has been successfully initiated