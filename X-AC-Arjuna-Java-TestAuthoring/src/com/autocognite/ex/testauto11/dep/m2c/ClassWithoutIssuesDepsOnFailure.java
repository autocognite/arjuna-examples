package com.autocognite.ex.testauto11.dep.m2c;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class ClassWithoutIssuesDepsOnFailure {
	
	@ClassDependency(FailureClass.class)
	public void test1Pass() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
}
