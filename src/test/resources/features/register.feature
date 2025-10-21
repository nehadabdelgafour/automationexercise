Feature: register
  Scenario: cenario: verify that user can enter with valid data
  Given user open home url
  When user click on signup
  And Signup Text is visible
  And Fill with valid data
  And user click on signup button
  And Enter Account Information
  And Address Information
  And user click on continue button