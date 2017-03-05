package com.autocognite.ex.testauto10.dep.m2m.diffclass.chain;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class ThirdClass {
	
	public void test1C3Pass() throws Exception{
		assertEquals(1,1);
	}
	
	public void test2C3Fail() throws Exception{
		fail();
	}
	
	public void test3C3Error() throws Exception{
		error();
	}
	
	@Skip
	public void test4C3Skipped() throws Exception{
		error();
	}
	
	public void nonTestMethod() throws Exception{
		error();
	}
}
