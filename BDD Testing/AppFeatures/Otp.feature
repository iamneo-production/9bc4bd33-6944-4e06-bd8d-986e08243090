Feature: OTP Page
Scenario: User OTP Page 
Given User Successfully creates an "Account"
And User gets "OTP" 
When User enters received "OTP" 
And clicks on "Verify" button 
And After Successful verification
Then User enters into "Login" page 