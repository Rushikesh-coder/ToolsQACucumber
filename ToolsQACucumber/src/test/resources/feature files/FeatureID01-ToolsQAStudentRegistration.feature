Feature: Verify Different modules of ToolsQA website

  Scenario Outline: verify Student registration on ToolsQA website
    Given user is on the "https://demoqa.com/automation-practice-form" website
    And user can see the page Header as "Practice Form"
    When user can see the student registration form text
    And user enters Name as "<userFirstName>" and "<userLastName>"
    And user enters emailID as "<Email>"
    And user select Gender "<Gender>"
    And user enters Mobile Number "<MobNumber>"
    And user enter subject name "<subjectName>"
    And user select state from dropDown "NCR" and city "Delhi"
    Then user submit student registration form

    Examples: 
      | userFirstName | userLastName | Email             | Gender | MobNumber  | subjectName      |
      | Rakesh        | Patil        | abc@any.com       | Male   | 8522148251 | Science          |
      | akshay        | sananse      | Akshay@any.com    | Male   | 9425487628 | Computer Science |
      | Vaishnavi     | Patil        | vaishnavi@any.com | Female | 9724859419 | English          |
