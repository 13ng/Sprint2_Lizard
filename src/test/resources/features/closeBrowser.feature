@logout
Feature: Default

	#{color:#172b4d}AC1- User can log out and ends up in login page.{color}
	#
	#{color:#172b4d}AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.{color}
	#
	#{color:#de350b}_*AC3- The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)*_{color}
	@UPG10-402
	Scenario: User is loged out, agter closing page
		When user in on a main page
		    And user clicks his username in a top right corner 
		    And user sees log out button 
		  And user close the browser 
		  And go on https://qa.upgenix.net/ again
		  Then user see can not see him self loged in