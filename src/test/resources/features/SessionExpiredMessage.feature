Feature: Default

	#{color:#172b4d}AC1- User can log out and ends up in login page.{color}
	#
	#{color:#de350b}_*AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.*_{color}
	#
	#AC3- The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)
	@UPG10-401
	Scenario: User is navigate back after loged in, and can not get to account 
		When user in on a main page
		    And user clicks his username in a top right corner 
		    And user sees log out button 
		    And user clicks "Log out" button 
		    And user on the login page and successful loged out 
		    And user hits "navigate back" button
		    Then user sees "Session Expired" message