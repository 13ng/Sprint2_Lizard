@login @login_n
Feature: Default

	#{color:#de350b}_*AC6- User should see the password in bullet signs by default while typing (like ****)*_{color}
	#
	#password - "true" means correct password 
	#
	# 
	@UPG10-262
	Scenario Outline: AC6 -User should see bullet signs when makes password input 
		Given user on login page of upgenix
		When user input correct password <password> to password bar
		Then user sees bullet signes in a password input bar
		Examples:
		  |password|
		  |"true"|