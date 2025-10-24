Feature: Login Page
  Scenario: Login Valid
    Given halaman login
    When input username dan password valid
    Then user di arahkan ke halaman dashboard

  Scenario: Login Invalid
    Given Open Website Invalid
    When Klik button login Invalid
    Then Error message Invalid

  Scenario: Login tanpa password
    Given buka halaman login
    When input username valid and klik button login
    Then erorr message

  Scenario: Login tanpa username
    Given open website
    When input password and klik button login
    Then erorr message username