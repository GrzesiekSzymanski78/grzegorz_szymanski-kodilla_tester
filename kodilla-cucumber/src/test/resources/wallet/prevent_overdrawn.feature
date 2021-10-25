Feature: Prevent users from going overdrawn
Scenario: Withdrawal from a wallet more cash then their balance
Given My wallet has been credited $200
When I request $201
Then Nothing should be dispensed
And I should be told that I have insufficient funds in my account