@price
Feature:  open the application
	Scenario: User wants to enter price  in  price textfield
	Given the application is in Post Free Ad Form PAGE
	When the user enter price in textfield which is beyond limit
	Then the user should get error msg 