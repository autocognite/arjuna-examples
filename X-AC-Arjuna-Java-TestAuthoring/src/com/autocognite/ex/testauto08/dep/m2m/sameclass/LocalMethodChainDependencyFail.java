package com.autocognite.ex.testauto08.dep.m2m.sameclass;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class LocalMethodChainDependencyFail {
	
	@MethodDependency("test2")
	public void test1() throws Exception{
		assertEquals(1,1);
	}

	@MethodDependency("test3")
	public void test2() throws Exception{
		assertEquals(1,1);
	}
	
	public void test3() throws Exception{
		fail();
	}
}
