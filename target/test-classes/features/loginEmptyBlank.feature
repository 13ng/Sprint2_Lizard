@login @login_n
Feature: Default

	#{color:#de350b}_*AC5- "Please fill out this field" message should be displayed if the password or username is empty*_{color}
	@UPG10-261
	Scenario Outline: AC5 - "Please fill out this field" message is displayed if input bar is empty or blank
		Given user on login page of upgenix
		   When user do not input to username bar
		   And user input correct password <password> to password bar
		   And user clicks Log in button
		   Then user sees Please fill out this field message from username input bar
		   Examples:
		   |password|
		   |"true"|
	@UPG10-261
		  Scenario Outline: AC5 - "Please fill out this field" message is displayed if password input bar is empty or blank
		    Given user on login page of upgenix
		    When user input correct posmanager username <username> to username bar
		    And user do not input to password bar
		    And user clicks Log in button
		    Then user sees Please fill out this field message from password input bar
		    Examples:
		      |username|
		      |22|