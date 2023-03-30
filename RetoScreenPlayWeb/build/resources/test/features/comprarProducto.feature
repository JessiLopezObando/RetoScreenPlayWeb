Feature: Buying a low-priced product on the Exito website
  As a user of the Exito website
  I want to buy a low-priced product
  To make a quick and easy online purchase

  @BuyLowPricedProduct
  Scenario: Buying a low-priced product on the Exito website
    Given that I am on the Exito website
    When I logging in using my credentials email and password
    And I search for and add a low-priced product to my cart
    And I proceed to checkout and enter my information
    Then I should see a confirmation message indicating a successful purchase.