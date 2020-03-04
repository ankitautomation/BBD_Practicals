Feature: Login Feature

Scenario: Login to Application With Valid Username and Password

	Given Setup the System Properties for Browser
	Given Launch the base url
	Given User is on login Page
	Then User Enter the username And User enter the password
	Then User Click on Login Button
	And User Verify the Dashboard Page
	Then Close the browser