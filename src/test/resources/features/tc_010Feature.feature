Feature: Edit Document Details

  Scenario: Validate editing document details
    Given a user has selected a loaded document
    When the user edits the metadata or description of the document
    And clicks on 'Save changes'
    Then the document is updated with the new details
    And a confirmation message is displayed