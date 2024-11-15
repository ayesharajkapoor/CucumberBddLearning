Feature: This is to test Google Search
Scenario: Google Search Scenario
Given User is entering http://google.co in
When User is typing the search term as 'Chennai'
And User enters the return key
Then User should see the search results