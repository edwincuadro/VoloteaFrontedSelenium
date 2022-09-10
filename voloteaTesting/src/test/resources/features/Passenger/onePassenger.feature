Feature: validate the reserve form
  As QAA
  I want to reserve tickets
  To validate the pre selected passenger quantity

  Scenario: validate the quantity of adult passenger pre selected.

    Given user on the site
    When user click on passenger field
    Then adult passenger field must be 1