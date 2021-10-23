Feature: Is number is divisible?
  Scenario Outline: Number is divisible by 3 or 5 or 3 and 5
    Given There is a <number>
    When Check weather number is divisible by three, five or by three and five
    Then I should receive <answer>
    Examples:
    |number|answer|
    |3 | "Fizz" |
    |5 | "Buzz" |
    |6 | "Fizz" |
    |7 | "None" |
    |9 | "Fizz" |
    |10| "Buzz" |
    |15| "FizzBuzz" |
    |18| "Fizz" |
    |30| "FizzBuzz" |
    |31| "None" |
    |40| "Buzz" |
    |45| "FizzBuzz" |

