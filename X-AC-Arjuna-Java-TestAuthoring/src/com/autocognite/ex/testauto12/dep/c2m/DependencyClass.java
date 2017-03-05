package com.autocognite.ex.testauto12.dep.c2m;

import com.autocognite.unitee.annotations.Skip;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
public class DependencyClass {
	
	public void testC2Pass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	public void testC2Fail() throws Exception{
		Assertions.fail();
	}
	
	public void testC2Error() throws Exception{
		Assertions.error();
	}
	
	@Skip
	public void testC2Skipped() throws Exception{
		Assertions.error();
	}
	
	public void nonTestMethod() throws Exception{
		Assertions.error();
	}
}
