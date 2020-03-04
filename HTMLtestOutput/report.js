$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium_Workspace/BDD/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to Application With Valid Username and Password",
  "description": "",
  "id": "login-feature;login-to-application-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Setup the System Properties for Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Launch the base url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User is on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Enter the username And User enter the password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Verify the Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCaseSteps.setup_the_System_Properties_for_Browser()"
});
formatter.result({
  "duration": 11186285200,
  "status": "passed"
});
formatter.match({
  "location": "TestCaseSteps.Launch_the_base_url()"
});
formatter.result({
  "duration": 4399478100,
  "status": "passed"
});
formatter.match({
  "location": "TestCaseSteps.user_is_on_login_Page()"
});
formatter.result({
  "duration": 14395800,
  "status": "passed"
});
formatter.match({
  "location": "TestCaseSteps.user_Enter_the_username_And_User_enter_the_password()"
});
formatter.result({
  "duration": 899996500,
  "status": "passed"
});
formatter.match({
  "location": "TestCaseSteps.user_Click_on_Login_Button()"
});
formatter.result({
  "duration": 3205681200,
  "status": "passed"
});
formatter.match({
  "location": "TestCaseSteps.user_Verify_the_Dashboard_Page()"
});
formatter.result({
  "duration": 1402651900,
  "status": "passed"
});
formatter.match({
  "location": "TestCaseSteps.close_the_browser()"
});
formatter.result({
  "duration": 900329300,
  "status": "passed"
});
});