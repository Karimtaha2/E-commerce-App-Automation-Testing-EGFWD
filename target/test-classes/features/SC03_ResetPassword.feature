@SmokeTesting
Feature: Reset Password Page

  Scenario: User could reset his/her password successfully

    Given user had a valid registered account
      And user navigates to home page

    When user clicked on Log in tab in the header website
      And user click on forgot password?
      And user enter email address in login page
      And user click on Recover button

    Then user should see message "Email with instructions has been sent to you."at the top