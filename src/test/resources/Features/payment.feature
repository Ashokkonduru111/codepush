Feature: Validate payment of obdX

@Functional
Scenario: verify user is able to send payment to internal account
Given User launch the browser and login Corporate Maker successfully in obdx
Then click on the toogle menu
Then click on payments and select payments transfer
And click on transfer money 
Then click on payee dropdown and enter payee name
Then enter the amount and payments details
And click on checkbox of accept terms
Then click on pay 
Then select confirm