package com.autocognite.ex.testauto12.dep.c2m;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class ChainDep2 {
	
	@MethodDependency(testMethods={"testC2Fail"}, containerClass=DependencyClass.class)
	public void test1() throws Exception{
		assertEquals(1,1);
	}

	public void test2() throws Exception{
		assertEquals(1,1);
	}

}
