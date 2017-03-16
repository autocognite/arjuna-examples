package com.autocognite.ex.testauto08.dep.m2m.sameclass;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class LocalMethodDependencyError {
	
	@MethodDependency("test2")
	public void test1() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}

	public void test2() throws Exception{
		error("Fake Error");
	}
}
