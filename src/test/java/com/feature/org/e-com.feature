Feature: E-commerce Shoping Functionality

@login
Scenario: user want to login the application
When user want to launch the application
And  user want to click the signin button
And user want to enter vaild email address
And user want to enter valid password
Then user want to verify the login credential 

Scenario: user want to select the Summer dresses
When user mouse hover to women category
And user want to select the summer dresses

@cart
Scenario: user want to add the selected product in the cart
When user move over on the summer dress
And user want to press the addcart button