Feature: bai du search
  Scenario: Search cucumber for baiDu
    Given Go to baiDu home
    When Type the search text "cucumber"
    And Click the submit
    Then result include cucumber

