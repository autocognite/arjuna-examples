package com.autocognite.ex.testauto08.dep.m2m.sameclass;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class LocalMethodDependencySkip {
	
	@MethodDependency("test2")
	public void test1() throws Exception{
		assertEquals(1,1);
	}

	@Skip
	public void test2() throws Exception{
		error("Fake Error");
	}
}
