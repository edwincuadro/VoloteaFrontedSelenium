Feature: Validate cities into countries field
  As QAA
  I want to select origin
  To validate the countries content

  Background: validate the quantity of adult passenger pre selected.
    Given user on the site

  Scenario: Check the countries' cities
    When user clic on origin and Countries field
    Then Country's cities must be shown up 22 Ciudades