@login @login_n
Feature: Default

	#_*{color:#de350b}AC3- "Wrong login/password" message should be displayed for invalid credentials (invalid username-valid password ){color}*_
	#
	# 
	#
	#*How to read this scenario?:*
	#
	#{color:#0747a6}|username| - "{*}false{*}"{color} in that case it will sendkeys( "{color:#0747a6}incorrectUsername{color}")
	#
	#{color:#0747a6}|password| - "{*}true{*}"{color} means correct password.  
	# 
	@UPG10-246
	Scenario Outline: AC3 - User try to log in with incorrect login. Automation
		Given user on login page of upgenix
		When user input incorrect username <username> to username bar
		And user input correct password <password> to password bar
		And user clicks Log in button
		Then user sees Wrong message
		Examples:
		|username|password|
		|"false"|"true"|