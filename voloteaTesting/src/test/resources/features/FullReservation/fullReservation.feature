Feature: Make a full ticket reservation
  As QAA
  I want to make a ticket reservation
  To validate the complete flow

  Background: Go to page
    Given user on the site
    When user click on passenger field

  Scenario Outline: Make a full reservation
    When user select '<adult>' '<child>' '<baby>'
    And user select
      | origin    | destiny |
      | Asturias | Alicante   |
    Then  user see the confirmation De Asturias a Alicante

    Examples:
      | adult | child | baby |
      | 2     | 2     | 2    |

