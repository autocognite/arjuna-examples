package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class FailureClass {
	
	public void test1Pass() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
	public void test2Fail() throws Exception{
		fail("Fake Failure");
	}
	
}
