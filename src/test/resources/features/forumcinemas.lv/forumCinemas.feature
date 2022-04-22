@ForumCinemas
@ProfilePage

Feature: Test ForumCinemas user login page and validate user profile page

  Scenario: Login to ForumCinemas and check user page information - name, surname
    Given Open home page
    And Open login page
    And Enter user email workjob@inbox.lv and password Homework10
    When Click login button
    And Open Profile Page
    Then Validate that name is Alina and surname is Krutajeva

