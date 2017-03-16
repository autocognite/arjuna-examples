package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
@ClassDependency(FailureSkippedClass.class)
public class C2CDemo4 {
	
	public void test1() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}

	public void test2() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}

}
