Feature: Validate that the origin field can searching by cities name
  As QAA
  I want to select origin
  To validate the origin field

  Background: validate the quantity of adult passenger pre selected.
    Given user on the site

  Scenario: Check that the origin field is able to search by cities name
    Given user select the origin field
    When User writing the searching on origin field
      | Barcelona |
    Then The origin field must does searching desde Barcelona