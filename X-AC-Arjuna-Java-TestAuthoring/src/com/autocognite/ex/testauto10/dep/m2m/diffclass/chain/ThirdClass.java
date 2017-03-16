package com.autocognite.ex.testauto10.dep.m2m.diffclass.chain;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class ThirdClass {
	
	public void test1C3Pass() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
	public void test2C3Fail() throws Exception{
		fail("Dummy Failure");
	}
	
	public void test3C3Error() throws Exception{
		error("Dummy Error");
	}
	
	@Skip
	public void test4C3Skipped() throws Exception{
		error("Dummy Error");
	}
	
	public void nonTestMethod() throws Exception{
		error("Dummy Error");
	}
}
