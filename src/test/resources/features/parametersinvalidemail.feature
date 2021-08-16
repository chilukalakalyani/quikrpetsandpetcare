@email
Feature:  error for invalid email and mobile number
	Scenario Outline: User wants to get error for invalid email and mobile number in  Post  Ad page
	Given the application is in Post Free Ad Form Page
	When the user enter "<email>","<mobilenumber>"
	Then the error should be displayed as invalid email and mobile number
	
	Examples:
	|email|mobilenumber|
	|ab@gmail.com|987654232|