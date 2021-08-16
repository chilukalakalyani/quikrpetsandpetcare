@title
Feature:  open the application
	Scenario: User wants to enter title in  Post  Ad page
	Given the application is in Post Free Ad Form 
	When the user enter lessthan four words in given title textfield
	Then the error should be displayed