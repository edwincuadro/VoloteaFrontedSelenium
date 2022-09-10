Feature: validate the group reservation link

  As QAA
  I want to reserve more than nine tickets
  To validate the group reservation link

  Background: validate the quantity of adult passenger pre selected.
    Given user on the site
    When user click on passenger field

  Scenario Outline: validate the activation of the group reservation link with more than nine passengers.

    When user input ten '<Adults>' and '<Children>' passengers
    Then the group reservation link must be enabled Reservas de grupos

    Examples:
      | Adults | Children |
      | 10     | 9        |
      | 9      | 10       |
      | 5      | 5        |
