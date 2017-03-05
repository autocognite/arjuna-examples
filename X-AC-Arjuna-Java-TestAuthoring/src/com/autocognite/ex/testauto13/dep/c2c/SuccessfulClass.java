package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class SuccessfulClass {
	
	public void test1Pass() throws Exception{
		assertEquals(1,1);
	}
	
	public void test2Pass() throws Exception{
		assertEquals(1,1);
	}
	
	@Skip
	public void test3Skip() throws Exception{
		error();
	}
	
}
