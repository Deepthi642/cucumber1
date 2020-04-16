Feature: Application Login

Scenario: Home page default login
Given user is on NetBanking landingpage
When use login into application with "jin" and password "1234"
Then Home page is populated
And cards displayed are "true"

Scenario: Home page default login
Given user is on NetBanking landingpage
When use login into application with "john" and password "4321"
Then Home page is populated
And cards displayed are "false"