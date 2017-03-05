package com.autocognite.ex.testauto10.dep.m2m.diffclass.chain;

import com.autocognite.unitee.annotations.Skip;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
public class ThirdClass {
	
	public void test1C3Pass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	public void test2C3Fail() throws Exception{
		Assertions.fail();
	}
	
	public void test3C3Error() throws Exception{
		Assertions.error();
	}
	
	@Skip
	public void test4C3Skipped() throws Exception{
		Assertions.error();
	}
	
	public void nonTestMethod() throws Exception{
		Assertions.error();
	}
}
