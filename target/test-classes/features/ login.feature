Feature: Login Test

Scenario: Successful Login

Given User is on login page
When User enters username "tomsmith"
And User enters password "SuperSecretPassword!"
And User clicks login button
Then User should see login success