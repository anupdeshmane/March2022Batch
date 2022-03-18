package cucumbermap;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.SeleniumOperations;

public class Login {

	
	
		
		@Given("^user opens \"(.*)\" browser with exe as \"(.*)\"$")
		public void brLaunch1(String bname, String exe) throws Throwable 
		{
			Object[] input=new Object[2];
			input[0]=bname;
			input[1]=exe;
			SeleniumOperations.bLaunch(input);
		}

		@Given("^user opens a url as \"([^\"]*)\"$")
		public void openApp1(String url) throws Throwable 
		{
			Object[] input1=new Object[1];
			input1[0]=url;
			SeleniumOperations.openApp(input1);
		}

		@When("^user cancel initial login page$")
		public void ClickOnCancle1()throws Throwable 
		{
			Object[] input2=new Object[1];
			input2[0]="//*[@class='_2KpZ6l _2doB4z']";
			SeleniumOperations.ClickOnCancle(input2);
		}

		@When("^user move on login$")
		public void MoveToLogin1() throws Throwable 
		{
			Object[] input3=new Object[1];
			input3[0]="//*[@class=\"_1psGvi _3BvnxG\"]";
			SeleniumOperations.MoveToLogin(input3);
		}

		@When("^User Click on my Profile$")
		public void ClickOnProfile1() throws Throwable 
		{
			Object[] input4=new Object[1];
			input4[0]="(//div[@class='_3vhnxf'])[1]";
			SeleniumOperations.ClickOnProfile(input4);
			
		}
				

		@When("^user enter user name as \"([^\"]*)\"$")
		public void EntUserName1(String arg1) throws Throwable 
		{
			Thread.sleep(3000);
			Object[] input5=new Object[1];
			input5[0]="//*[@class=\"_2IX_2- VJZDxU\"]";
			SeleniumOperations.EntUserName(input5);
		}

	
		@When("^user enter password as \"([^\"]*)\"$")
		public void EntPass1(String arg1) throws Throwable {
		
			Object[] input6=new Object[1];
			input6[0]="//*[@class=\"_2IX_2- _3mctLh VJZDxU\"]";
			SeleniumOperations.EntPass(input6);
		  
		}

		@When("^user click on login button$") 
		public void Login11()throws Throwable
		{
			Object[] input7=new Object[1];
			input7[0]="//*[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]";
			SeleniumOperations.Login1(input7);
		
		}
		@Then("^application user logged succesfully$")
		public void validLogin1() throws Throwable{
			Thread.sleep(3000);
			Object[] input8=new Object[2];
			input8[0]="AnupAnup DeshmaneDeshmane";
			input8[1]="//*[text()='AnupAnup DeshmaneDeshmane']";
			SeleniumOperations.ValidLogin(input8);
		}
}
		
	