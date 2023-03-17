@login @login_s
Feature: Default

	#AC1-Users can log in with valid credentials of Posmanager

	@UPG10-247
	Scenario Outline: User log in with correct credentials for Posmanager. Automation
		Given user on login page of upgenix
		When user input correct posmanager username <username> to username bar
		And user input correct posmanager password <password> to password bar
		And user clicks Log in button
		Then user successfully loged in
		Examples:
		|username|password|
		|6|"true"|
		|7|"true"|
		|8|"true"|
		|9|"true"|
		|10|"true"|
		|11|"true"|
		|12|"true"|
		|13|"true"|
		|14|"true"|
		|15|"true"|
		|16|"true"|
		|17|"true"|
		|18|"true"|
		|19|"true"|
		|20|"true"|
		|21|"true"|
		|22|"true"|
		|23|"true"|
		|24|"true"|
		|25|"true"|
		|26|"true"|
		|27|"true"|
		|28|"true"|
		|29|"true"|
		|30|"true"|
		|31|"true"|
		|32|"true"|
		|33|"true"|
		|34|"true"|
		|35|"true"|
		|36|"true"|
		|37|"true"|
		|38|"true"|
		|39|"true"|
		|40|"true"|