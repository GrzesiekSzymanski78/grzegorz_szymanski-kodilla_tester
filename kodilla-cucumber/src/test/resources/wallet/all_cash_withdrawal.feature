Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet all cash
    Given In my wallet i have $200
    When  I request $200
    Then $200 should be dispensed
    And The balance of my wallet should be $0