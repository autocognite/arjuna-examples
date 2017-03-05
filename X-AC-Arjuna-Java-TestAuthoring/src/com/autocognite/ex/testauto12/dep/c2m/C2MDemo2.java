package com.autocognite.ex.testauto12.dep.c2m;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
@MethodDependency(testMethods={"testC2Fail"}, containerClass=DependencyClass.class)
public class C2MDemo2 {

	public void test1() throws Exception{
		assertEquals(1,1);
	}

	public void test2() throws Exception{
		assertEquals(1,1);
	}

}
