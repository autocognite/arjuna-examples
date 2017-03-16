package com.autocognite.ex.testauto12.dep.c2m;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class DependencyClass {
	
	public void testC2Pass() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
	public void testC2Fail() throws Exception{
		fail("Dummy Failure");
	}
	
	public void testC2Error() throws Exception{
		error("Dummy Error");
	}
	
	@Skip
	public void testC2Skipped() throws Exception{
		error("Dummy Error");
	}
	
	public void nonTestMethod() throws Exception{
		error("Dummy Error");
	}
}
