Feature: Default

	#{color:#de350b}_*AC1- User can log out and ends up in login page.*_{color}
	#
	#AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.
	#
	#AC3- The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)
	@UPG10-392
	Scenario: User is on the login page after hiting log out button
		When user in on a main page
		    And user clicks his username in a top right corner 
		    And user sees log out button 
		    And user clicks "Log out" button 
		    Then user on the login page and successful loged out