Feature: Login Functionality

Background: User is succfully launch application
Given user opens "Chrome" browser with exe as "D:\\NewFlipkartProject2022\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
Given user opens a url as "https://www.flipkart.com/"

@SmokeTest
Scenario: Login Functionality with valid credentials
When user cancel initial login page
When user move on login
When User Click on my Profile
When user enter user name as "anup.deshmane@gmail.com"
When user enter password as "9766072684"
When user click on login button
Then application user logged succesfully 