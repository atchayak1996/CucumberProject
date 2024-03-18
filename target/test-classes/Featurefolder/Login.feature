Feature: To validate the login functionality of facebook application



Scenario:	To validate the invalid email and valid password
Given  User have to launch the facebook application using chromebrowser
When User have to enter invalid username and valid password

And User have to click login button

Then User have to reach the invalid credential page
 
Scenario:	To validate the invalid email and invalid password
Given User have to launch the facebook application using chromebrowser
When User have to enter invalid username and invalid password

And User have to click login button

Then User have to reach the invalid credential page
 
 