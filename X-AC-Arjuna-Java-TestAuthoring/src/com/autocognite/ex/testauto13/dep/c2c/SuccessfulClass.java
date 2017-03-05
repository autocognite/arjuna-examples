package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.unitee.annotations.Skip;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
public class SuccessfulClass {
	
	public void test1Pass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	public void test2Pass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Skip
	public void test3Skip() throws Exception{
		Assertions.error();
	}
	
}
