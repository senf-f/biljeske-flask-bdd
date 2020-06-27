Feature: Notes
  User can add, update and delete notes with categories.

  Scenario: Add a note
    Given user is on the homepage
    When user adds a note
    Then note is visible in the list

  Scenario: Update a note
    Given user is on the homepage
    And note is visible in the list
    When user edits a note
    Then updated note is visible in the list

  @WIP
  Scenario: Delete a note
    Given user is on the homepage
    And note is visible in the list
    When user deletes a note
    Then note is not visible in the list