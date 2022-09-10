Feature: Validate that the origin field can searching by cities' IATA codes
  As QAA
  I want to select origin
  To validate the origin field

  Background: validate the quantity of adult passenger pre selected.
    Given user on the site
    Given user select the origin field

  Scenario: Check that the origin field is able to search by cities' IATA codes
    When User writing the searching on the origin field
      | BCN |
    Then The origin field must do searching Barcelona