Feature: Home page
  Scenario: detail produk
    Given open website detail
    When input username and password valid detail
    And klik button login detail
    And klik name product
    Then see detail product

  Scenario: add a cart
    Given open website add
    When input username and password valid add
    And klik button login add
    And add a cart
    And klik a cart
    Then See the cart contents

  Scenario: remove produk cart
    Given open website remove produk cart
    When input password and password valid remove cart
    And klik button login remove cart
    And add a cart remove
    And klik a cart remove
    And klik remove produk
    Then product succes remove


