package com.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalStepDef {
	@Given("^two numbers$")
	public void two_numbers() throws Throwable {
		System.out.println("eneter number");
	    }

	@When("^user enter (\\d+) and (\\d+) and \"([^\"]*)\"$")
	public void user_enter_and_and(int arg1, int arg2, String arg3) throws Throwable {
		if(arg3.contains("+"))
		{
			System.out.println(arg1+arg2);
		}
		else if(arg3.contains("*"))
		{
		System.out.println(arg1*arg2);
		}
	   	}

	@Then("^user get result$")
	public void user_get_result() throws Throwable {
		System.out.println("Thank you Ram........");
	   	}


}
