Feature: sharekhan website test 

Scenario: LoginPage of ShareKhan 

	Given user opens browser 
	Then user is on login page 
	Then user validates sharekhan logo 
	Then user enters username 
	Then user clicks on next button 
	Then user enters password 
	Then user clicks on login button 
	
Scenario: Homepage verification 

	When user is on new Homepage 
	Then user clicks on menu button 
	Then user clicks on switch to old site button 
	Then user is on homepage 
	Then user verifies the user profile 
	Then user checks all panel headings of Home Tab 
	Then user checks all panel elements of Home Tab 
	
	
	
Scenario: Validating IPOBonds Page 

	When user clicks on IPO tab 
	Then user is on IPOBonds Page 
	Then user verifies top side links 
	Then user verifies all main links 
	Then user verifies all bottom links 
	
Scenario: Validating Mutual Funds Page 

	When user clicks on Mutual Funds tab 
	Then user is on Mutual Funds page 
	Then user verifies links of page 
	Then user veries elements of page 
	
Scenario: Validating Portfolio Page 

	When user clicks on Portfolio tab 
	Then user is on Portfolio page 
	Then user verifies my portfolio bar 
	Then user verifies all black buttons 
	
Scenario: Validating OptionChain Page 

	When user clicks on OptionChain tab 
	Then user is on OptionChain page 
	Then user verifies option chain bar 
	Then user verifies all black button 
	
Scenario: Validating News Page 
	When user click on News tab 
	Then user is on news page 
	Then user verifies all links of news page 
	Then user verifies all headings of news page 
	Then user verifies all news headings 
	
Scenario: Validating Research Page 
	When user click on Research tab 
	Then user is on Research page 
	Then user verifies all links of research page 
	Then user verifies all research headings 
	
Scenario: Validating CS Page 
	When user click on CS tab 
	Then user is on CS page 
	Then user verifies all label of CS page 
	Then user verifies all content of CS page 
	
Scenario: Loging out from website 
	Then user clicks on logout button 
	Then user close the browser