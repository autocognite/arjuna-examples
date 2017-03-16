package com.autocognite.ex.testauto12.dep.c2m;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
@MethodDependency(testMethods={"testC2Pass"}, containerClass=DependencyClass.class)
public class C2MDemo1 {
	
	public void test1() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}

	public void test2() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}

}
