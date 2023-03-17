@login @login_s
Feature: Default

	#{color:#de350b}_*AC7- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.*_{color}
	# 
	#
	#*How to read this scenario?:*
	#
	#{color:#0747a6}|username| 6,9{color} is a number of account of  salesmanager.
	#
	#{color:#0747a6}|password| - "true"{color} means correct password.  
	#
	#exm.
	#|20|"true"|  - username: [salesmanager{*}{color:#de350b}20{color}{*}@info.com|mailto:salesmanager20@info.com] password: {color:#de350b}salesmanager{color}|
	#|8|"true"|  - username: [salesmanager{color:#de350b}*8*{color}@info.com|mailto:salesmanager20@info.com] password: {color:#de350b}salesmanager{color}|
	#
	# 
	@UPG10-263
	Scenario Outline: AC7- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
		Given user on login page of upgenix
		When user input correct salesmanager username <username> to username bar
		And user input correct salesmanager password <password> to password bar
		And user use ENTER button on a keyboard 
		Then user successfully loged in
		Examples:
		|username|password|
		|6|"true"|
		|7|"true"|
		|8|"true"|
		|9|"true"|