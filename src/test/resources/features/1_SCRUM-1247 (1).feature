@SCRUM-1252
Feature: Default

	Background:
		#@SCRUM-1247
		Given Users should go to the Authorization page
		And Users should enter valid user name
		* Users should enter valid password
		* Users should click the Log in button
		Then Users are on the Portal page
		
		
		

	#Users can log out, Authorization page should be displayed and User should not able to go back to homepage by clicking step back button.
	@SCRUM-1251
	Scenario: CLONE - Log out Function
		Users should able to log out
		When Users click profile dropdown should see Log out option
		And Users click Log out option
		Then Users should be on the Authorization page
		Then Users click the step back button
		Then Users should stay on the same page