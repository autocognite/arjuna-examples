package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
@ClassDependency(FailureClass.class)
public class ChainDep1 {
	
	public void test1Pass() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
}
