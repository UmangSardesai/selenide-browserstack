# Selenide-BrowserStack
Run a sample Selenide test on BrowserStack

##Setup

Clone this repo: `git clone https://github.com/UmangSardesai/selenide-browserstack.git`

Note: You need Maven installed.

## Configuration
Add BrowserStack Username and Automate-key to `BrowserStackFactory.java`

## Run Tests
1. To launch the test on your local browser:
  
  `mvn clean test`

2. To run tests on BrowserStack, you simply need to point the hub URL to our Selenium hub 'http://hub.browserstack.com/wd/hub' along with your Username and Automate-key. In Selenide, you can so this by giving the hub URL with the remote parameter as given below:
  
  `mvn clean test -Dremote=http://<username>:<automate-key>@hub.browserstack.com/wd/hub`

3. However, you would want to also want to select a particular browser and OS combination on BrowserStack. For this you create a Java file which returns a RemoteWebDriver object. You can then pass this file as a parameter while running your test as follows:

  `mvn clean test -Dselenide.browser=com.BrowserStack.BrowserStackFactory`
  
## Further Reading
- [Selenide](http://selenide.org/documentation.html)
- [BrowserStack documentation for Automate](https://www.browserstack.com/automate/java)

Happy Testing!   
