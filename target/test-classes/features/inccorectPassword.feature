@login @login_n
Feature: Default

	#_*{color:#de350b}AC4- "Wrong login/password" message should be displayed for invalid credentials (valid username-invalid password ){color}*_
	#
	# 
	#
	#*How to read this scenario?:*
	#
	#{color:#0747a6}|username| - "{*}15{*}"{color} in that case it will sendkeys( "{color:#0747a6}salesmanager15@info.com{color}")
	#
	#{color:#0747a6}|password| - "{*}true{*}"{color} means correct password.  
	# 
	@UPG10-248
	Scenario Outline: AC4 - User try to log in with incorrect password. Automation
		Given user on login page of upgenix
		When user input correct salesmanager username <username> to username bar
		And user input incorrect password <password> to password bar
		And user clicks Log in button
		Then user sees Wrong message
		Examples:
		|username|password|
		|15 |"false"|
		|6 |"false"|