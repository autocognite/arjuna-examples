package com.autocognite.ex.testauto12.dep.c2m;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
@MethodDependency(testMethods={"test1"}, containerClass=ChainDep2.class)
public class C2MDemo6 {
	
	public void test1() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}

	public void test2() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}

}
