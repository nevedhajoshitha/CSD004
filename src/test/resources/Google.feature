Feature: Search functionality

Scenario: To check the search in Google
Given Google page is open
When User enters a <text> in search text box
And Click on search button
Then Close the browser

Examples:
|text|
|Selenium|

