package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
public class FailureClass {
	
	public void test1Pass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	public void test2Fail() throws Exception{
		Assertions.fail("Fake Failure");
	}
	
}
