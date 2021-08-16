@dropdown
Feature:  open the application
	Scenario: User wants to select option from pettype dropdown in  Post Ad page
	Given the application is in Post Free Ad page Form 
	When the user select more than one option from dropdown
	Then the error should be displayed as select one option