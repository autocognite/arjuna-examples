package com.autocognite.ex.testauto11.dep.m2c;

import com.autocognite.unitee.annotations.Skip;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
@Skip
public class ErrorClass {
	
	public void test1Pass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	public void test2Error() throws Exception{
		Assertions.error("Fake Error");
	}
	
}
